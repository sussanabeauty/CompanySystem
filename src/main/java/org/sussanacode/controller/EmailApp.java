package org.sussanacode.controller;

import org.sussanacode.model.Email;
import org.w3c.dom.ls.LSOutput;

public class EmailApp {

    public Email setEmail(){
        Email empEmail1 = new Email("John", "Smith");

        empEmail1.displayEmpInfo();

        return  empEmail1;
    }
}
