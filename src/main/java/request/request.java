/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

import com.swagger.swagger.entity.SSHInformation;
import com.swagger.swagger.entity.patientinformation;

/**
 *
 * @author JuanDiego
 */
public class request {
    
    private patientinformation patientinformation;
    private SSHInformation SSHInformation;

    public patientinformation getPatientinformation() {
        return patientinformation;
    }

    public void setPatientinformation(patientinformation patientinformation) {
        this.patientinformation = patientinformation;
    }

    public SSHInformation getSSHInformation() {
        return SSHInformation;
    }

    public void setSSHInformation(SSHInformation SSHInformation) {
        this.SSHInformation = SSHInformation;
    }
    
    
    
    
    
}
