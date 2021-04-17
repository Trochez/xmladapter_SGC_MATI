/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package response;

/**
 *
 * @author JuanDiego
 */
public class response {
    
    private String idType;
    private long id;
    private String socialSecurityHealth;
    private Boolean affiliationStatus;
    private String lastUpdate;
    private String responseCode;
    private String messageCode;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }
    
    
    
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSocialSecurityHealth() {
        return socialSecurityHealth;
    }

    public void setSocialSecurityHealth(String socialSecurityHealth) {
        this.socialSecurityHealth = socialSecurityHealth;
    }

    public Boolean getAffiliationStatus() {
        return affiliationStatus;
    }

    public void setAffiliationStatus(Boolean affiliationStatus) {
        this.affiliationStatus = affiliationStatus;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
    
    
    
}
