package Exercises.ProductDelivering.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientData {

    private static SimpleDateFormat sf1 = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;

    private Date birthDate;
    public ClientData(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate(){
        return birthDate;
    }



    @Override
    public String toString() {
        return name + " (" + sf1.format(birthDate) + ") - " + email;
    }
}
