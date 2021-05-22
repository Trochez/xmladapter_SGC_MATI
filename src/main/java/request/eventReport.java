/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import javax.xml.bind.annotation.*;

/**
 *
 * @author JuanDiego
 */
@XmlRootElement(name="event", namespace="event")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "event")
public class eventReport {
    
    @XmlAttribute
    @JacksonXmlProperty
    private float magnitude;
    
    @XmlElement(name="location")
    @JacksonXmlProperty(localName = "location")
    @JacksonXmlElementWrapper(useWrapping = false)
    private location location;
    
    @XmlAttribute
    @JacksonXmlProperty
    private String time;
    
    @XmlAttribute
    @JacksonXmlProperty
    private float depth;
    
    @XmlAttribute
    @JacksonXmlProperty
    private float duration;

    public float getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(float magnitude) {
        this.magnitude = magnitude;
    }

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
    
    
    
    
}
