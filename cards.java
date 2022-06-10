/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1118070
 */
public class cards {
    private int number;
    private String type;
    public cards(int number, String type){
        this.number = number;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public int getNumber(){
        return number;
    }
    public String getCard(){
        return String.valueOf(number) + type; 
    }
}
