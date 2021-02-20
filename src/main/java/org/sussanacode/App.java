package org.sussanacode;

import org.sussanacode.controller.EmailApp;
import org.sussanacode.model.Email;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Email empEmail1 = new Email("John", "Smith");




        System.out.println(empEmail1.displayEmpInfo());
    }
}
