/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matsu
 */
public class QuackObserver implements Observer{
    
    public void update(Quackable quackable){
        System.out.println(quackable.getName()+"が鳴きました");
    }
}
