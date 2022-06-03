
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class updateNote {
    static public ArrayList<String> words = new ArrayList();
    static public playerInfo selected;
    static public int selectedIndex;
    public updateNote(){
    
    }
    static public void loadWords() {
        String currentDirectory = System.getProperty("user.dir");
        String fullFileName = currentDirectory + "/accountInfo.txt";
        System.out.println("The file path is " + fullFileName);
        words.clear();
        try {   
                FileReader fr = new FileReader(fullFileName);
                BufferedReader br = new BufferedReader(fr);
                String line="";
                while( (line = br.readLine()) != null) {
                    System.out.println("Just read: " + line);
                    words.add(line);
                }
                br.close();
        }
        catch(Exception e) {
                System.out.println("Something went wrong file reading!");
        }
    }
    
    static public void updateNotePad(){
        String currentDirectory = System.getProperty("user.dir");
        String fullFileName = currentDirectory + "/accountInfo.txt";
        
        try {
            FileWriter fw = new FileWriter(fullFileName);
            BufferedWriter br = new BufferedWriter(fw);
           
            for(int k =0; k<words.size(); k++ ){
                br.write(words.get(k)+"\n");        //add a newline character
                
            }
            
            br.close();
        }
        catch(Exception e) {
            System.out.println("Error writing to file");
        }
        
    
    }
    
}
