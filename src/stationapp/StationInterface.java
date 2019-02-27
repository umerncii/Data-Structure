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
public interface StationInterface {
    public boolean isEmpty();
    public String size();
    public String display();
    public Object front();
    public Object dequeue();
    public void enqueue(Object newItem);
    
}
