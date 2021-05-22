/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import javax.xml.bind.annotation.*;

/**
 *
 * @author JuanDiego
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="location", namespace="location")
public class location {
    
    @XmlAttribute
    private float latitude;
    
    @XmlAttribute
    private float longitude;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    
    
}
