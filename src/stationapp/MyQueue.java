/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stationapp;

import java.util.ArrayList;

/**
 *
 * @author x17111854
 */
public class MyQueue implements StationInterface {
    public ArrayList<Car>myArray;
    public MyQueue(){
        myArray=new ArrayList<Car>();
    }
    //for empty
    @Override
    public boolean isEmpty(){
        return myArray.isEmpty();
    }
    @Override
    public String size(){
        if(!myArray.isEmpty()){
            if(myArray.size()>5){
                return "Help please "+myArray.size();
            }
            else{
                return "There are "+myArray.size()+" vehicle in station";
            }
            
        }
        else{
            return "Empty stations";
        }
        
    }
    @Override
    public String display(){
        String input="";
        for(int i=0;i<myArray.size();i++){
            input=input+"Type of car "+myArray.get(i).getType()+" and number "+myArray.get(i).getNumber()+"\n";
        }
        return input;
    }
    //for dequeue
    @Override
    public Object dequeue(){
        return myArray.remove(0);
    }
    //for enqueue
    @Override
    public void enqueue(Object newItem){
       myArray.add((Car)newItem);
            
        }
    //for front
    @Override
    public Object front(){
        return myArray.get(0);
    }
    
}
