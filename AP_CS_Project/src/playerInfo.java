/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class playerInfo {
    static private int points;
    static private int player;
    static private String name;
    public playerInfo(int player, String name){
        this.player = player;
        this.points = 0;
        this.name = name;
    }
    public void setPoints(int k){
        points = k;
    }
    public int getPoints(){
        return points;
    }
    public int getPlayer(){
        return player;
    }
    public String getName(){
        return name;
    }
}
