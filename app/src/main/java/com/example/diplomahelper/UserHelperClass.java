package com.example.diplomahelper;

public class UserHelperClass {



    String Name,Email,Password,Branch;


    public UserHelperClass() {

    }

    public UserHelperClass(String name, String email, String password, String branch) {
        Name = name;
        Email = email;
        Password = password;
        Branch = branch;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }
}
