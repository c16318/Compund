/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class RedHeadDuck extends Quackable{
    private String name = "RedHeadDuck";
    
    public String getName(){
        return name;
    }
    public void quack(){
        System.out.println("ガーガー");
        //notifyobservers();
    }
}
