package com.example.bonappetite;

public class Model
{
  String recname,recdetails;

    public Model(String name, String details) {
        this.recname = name;
        this.recdetails = details;
    }

    public String getName() {
        return recname;
    }

    public void setName(String name) {
        this.recname = name;
    }


    public String getDetails() {
        return recdetails;
    }

    public void setDetails(String details) {
        this.recdetails = details;
    }
}
