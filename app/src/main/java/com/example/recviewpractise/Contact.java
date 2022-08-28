package com.example.recviewpractise;

public class Contact {

    private int sno;
    private String phoneno;
    private String name;

    Contact(int sno, String name, String phoneno){
        this.sno = sno;
        this.phoneno = phoneno;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getPhoneno() {
        return phoneno;
    }
}
