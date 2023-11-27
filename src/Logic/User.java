package Logic;

import java.util.ArrayList;

public class User {

    private String nama;
    private String nomorTelepon;
    private String role;

    public String getName() {
        return nama;
    }

    public String getPhoneNumber() {
        return nomorTelepon;
    }
    
    public String getRole() {
        return role;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void setPhoneNumber(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
   
    public void setRole(String role) {
        this.role = role;
    } 
}
