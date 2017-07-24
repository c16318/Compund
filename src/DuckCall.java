/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *カモ笛
 * @author c16318
 */
public class DuckCall extends Quackable{
    private String name = "DuckCall";
    
    public String getName(){
        return name;
    }
    public void quack(){
        System.out.println("ガアガア");
        notifyobservers();
    }
}
