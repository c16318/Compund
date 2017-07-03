/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16318
 */
public class GooseAdapter implements Quackable{
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    public void quack(){
        goose.honk();
    }
}
