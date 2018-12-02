/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaobjects_1.model;

/**
 *
 * @author student
 */
//Class
public class Product {
    /* 1 */
    //Fields for objects of this Class
    /*public int id;
    public String title;*/
    
    /* 2 */
    private int id;
    private String title;
    
    public void setId(int _id) throws Exception{
        if (_id > 0) {
            id = _id;
        } else {
            throw new Exception("id must be > 0");
        }
    }
    
    public int getId(){
        return id;
    }
}
