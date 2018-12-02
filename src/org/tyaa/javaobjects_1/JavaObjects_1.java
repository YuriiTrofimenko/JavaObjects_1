/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaobjects_1;

import org.tyaa.javaobjects_1.model.Product;

/**
 *
 * @author student
 */
public class JavaObjects_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        /* 1 */
        //Variable of type Product
        //n
        //Object of type Product
        /*Product p1 = new Product();
        p1.id = 1;
        Product p11 = p1;
        Product p2 = new Product();
        p2.id = 2;
        p1.title = "Prod1";
        p2.title = "Prod2";
        System.out.println(p11.id);
        System.out.println(p11.title);
        System.out.println(p2.id);
        System.out.println(p2.title);*/
        
        /* 2 */
        Product p1 = new Product();
        //p1.id = 1;
        p1.setId(10);
        System.out.println(p1.getId());
    }
    
}
