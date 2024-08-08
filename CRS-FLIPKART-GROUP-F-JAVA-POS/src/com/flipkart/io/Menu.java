package com.flipkart.io;

public class Menu {
    protected String uname;
    protected String pswd;

    public void set(String uname, String pswd) {
        this.uname = uname;
        this.pswd = pswd;
    }

    public boolean valid(String uname, String pswd) {
        return (uname.equals(this.uname) && pswd.equals(this.pswd));
    }

    public void run() {
        System.out.println("Menu\n\n");
    }
}
