
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class playerInfo {
    static private int points;
    static private int playerId;
    static private String name;
    public playerInfo(String name, int points, int playerId){
        this.playerId = playerId;
        this.points = points;
        this.name = name;
    }
    public void setPoints(int k){
        points = k;
    }
    public int getPoints(){
        return points;
    }
    public int getPlayerId(){
        return playerId;
    }
    public String getName(){
        return name;
    }
}
