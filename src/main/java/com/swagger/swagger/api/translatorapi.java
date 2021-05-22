/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagger.swagger.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import request.eventReport;

/**
 *
 * @author root
 */
@RestController
@RequestMapping("/soaptorest")
@Api(value = "adaptator service to translate soap response to rest response", description = "adaptator service to translate soap response to rest response")
public class translatorapi {

    
    /**
     *
     * @param request
     * @return
     */
    @PostMapping("")
    @ApiOperation(value = "Get SOAP response and translate it to rest", notes = "Get SOAP response and translate it to rest")
    public eventReport getSoapToRest(@RequestBody eventReport eventReport){
        
        //System.out.println("input  eventReport magnitude   "+eventReport.getMagnitude()+" location  "+eventReport.getLocation().getLatitude());

        return eventReport;

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
