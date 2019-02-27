/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationapp;

/**
 *
 * @author x17111854
 */
public class Car {
    //data type
    public String type;
    public String number;
    //dfault-cons
    public Car(){
        type="";
        number="";
    }
    //setter

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    //getter

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
    
    
}
