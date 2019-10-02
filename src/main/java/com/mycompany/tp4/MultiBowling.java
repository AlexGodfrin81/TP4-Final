/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp4;

import bowling.MultiPlayerGame;
import bowling.SinglePlayerGame;
import java.util.ArrayList;

/**
 *
 * @author pedago
 */
public class MultiBowling implements MultiPlayerGame {
    
    public boolean gameStatue;
    public ArrayList<Player> p = new ArrayList<Player>();
    
    
    public MultiBowling(){
        this.gameStatue = false;
    }
    
    
    @Override
    public String startNewGame(String[] playerName) {
        
        for (int i = 0;i<playerName.length;i++){
            p.add(new Player(playerName[i]));
            System.out.println(p);
        }
        gameStatue = true;
        return "Prochain tir : joueur ";
    }

    @Override
    public String lancer(int nombreDeQuillesAbattues) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int scoreFor(String playerName) throws Exception {
        if (gameStatue){
            for (int i = 0 ; i<p.size() ; i++){
            if (p.get(i).name == playerName){
                return p.get(i).score();
            }
          }
        }else{
            throw new UnsupportedOperationException("La partie n'a pas encore commencé");
        }
        throw new NullPointerException("Ce joueur n'existe pas");
    }
    
}
