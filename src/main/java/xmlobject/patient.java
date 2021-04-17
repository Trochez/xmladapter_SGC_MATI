/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlobject;

/**
 *
 * @author JuanDiego
 */

public class patient {
    
    private String name;
    private String lastname;
    private String birthday;
    private Boolean active;
    private long id;
    private String idtype;
    private location location;
    private code code;
    private String epsname;
    private String update;

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
    
    

    public String getEpsname() {
        return epsname;
    }

    public void setEpsname(String epsname) {
        this.epsname = epsname;
    }
    
    

    public location getLocation() {
        return location;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public code getCode() {
        return code;
    }

    public void setCode(code code) {
        this.code = code;
    }
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }
    
    
    
}
