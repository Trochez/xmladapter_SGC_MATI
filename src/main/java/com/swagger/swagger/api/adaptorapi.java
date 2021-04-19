/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.swagger.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.NodeList;
import request.request;
import response.response;
import xmlobject.patient;

/**
 *
 * @author root
 */
@RestController
@RequestMapping("/soaptorest")
@Api(value = "adaptator service to translate soap response to rest response", description = "adaptator service to translate soap response to rest response")
public class adaptorapi {

    
    /**
     *
     * @param request
     * @return
     */
    @PostMapping("")
    @ApiOperation(value = "Get SOAP response and translate it to rest", notes = "Get SOAP response and translate it to rest")
    public response getSoapToRest(@RequestBody request request){
        
        response response = new response();
        
        System.out.println("in getSoapToRest");
        
        long id = request.getPatientinformation().getId();
        
        URL url;
        try {
            
            url = new URL(request.getSSHInformation().getProviderURL()+"?id="+id);
            
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();
            Reader streamReader = null;
            if (status > 299) {
                streamReader = new InputStreamReader(con.getErrorStream());
            } else {
                streamReader = new InputStreamReader(con.getInputStream());
            }
            
            String xml = IOUtils.toString(streamReader);
            streamReader.close();
            
            
            
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
            
            XMLInputFactory f = XMLInputFactory.newFactory();
            XMLStreamReader sr = f.createXMLStreamReader(new StringReader(xml));
            
            String TARGET_ELEMENT = "patient";
            
            patient patient = null;

            while (sr.hasNext()) {
                int type = sr.next();
                
                if (type == XMLStreamReader.START_ELEMENT && TARGET_ELEMENT.equals(sr.getLocalName())) {
                    patient = xmlMapper.readValue(sr, patient.class);
                }
            }
                        
            response.setAffiliationStatus(patient.getActive());
            response.setId(patient.getId());
            response.setIdType(patient.getIdtype());
            response.setLastUpdate(patient.getUpdate());
            response.setSocialSecurityHealth(patient.getEpsname());
            
            response.setMessageCode(patient.getCode().getMessageCode());
            response.setResponseCode(patient.getCode().getCodeResponse());
            
                        
            //System.out.println("Response xmlpatient   -----  "+xmlpatient.getName());            
            
        } catch (MalformedURLException ex) {
            System.err.println("ERROR   "+ex);
            
            response.setMessageCode("04");
            response.setMessageCode("Error obteniendo información de paciente");
            
            
        } catch (IOException | XMLStreamException ex) {
            System.err.println("ERROR   "+ex);
            
            response.setMessageCode("04");
            response.setMessageCode("Error obteniendo información de paciente");
            
        }
        
       
        
        
        return response;

    }
    
    /**
     *
     * @return
     */
    @GetMapping("/test")
    @ApiOperation(value = "test availability api", notes = "test availability api")
    public String test(){
        
        return "OK test soapadapter";

    }
    
    
    
}
