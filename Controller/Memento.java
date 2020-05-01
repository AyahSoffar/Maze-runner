/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Player;

/**
 *
 * 
 */
public class Memento {
    
    private Player state;
    public Memento(Player state){
        this.state=state;
    }
    public Player getState(){
        return state;
    }
    
}
