import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class SimpleReader {
    
    public void readFile() throws Exception {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Your directory is " + currentDirectory);
        String fullFileName = currentDirectory + "/abc.txt";
        System.out.println("The file path is " + fullFileName);
        
        //a list to remember what we read from the file
        ArrayList<String> stuff = new ArrayList();
        
        //set up buffered reader
        FileReader fr = new FileReader(fullFileName);
        BufferedReader br = new BufferedReader(fr);
        
        //do the reading (print out and save into list)
        String line="";
        while( (line = br.readLine()) != null) {
            System.out.println("Just read: " + line);
            stuff.add(line);
        }
        
        br.close();
        
        //show the arraylist contents
        for(int k=0; k<stuff.size(); k++){
            System.out.println("stuff index " + k + " --> " + stuff.get(k)  );        
        }
        
    }
    
    public void readFile2() {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Your directory is " + currentDirectory);
        String fullFileName = currentDirectory + "/abc.txt";
        System.out.println("The file path is " + fullFileName);
        
        //a list to remember what we read from the file
        ArrayList<String> stuff = new ArrayList();
        
        //set up buffered reader
        try {   
                FileReader fr = new FileReader(fullFileName);
                BufferedReader br = new BufferedReader(fr);

                //do the reading (print out and save into list)
                
                String line="";
                while( (line = br.readLine()) != null) {
                    System.out.println("Just read: " + line);
                    stuff.add(line);
                }
                
                br.close();
        }
        catch(Exception e) {
                System.out.println("Something went wrong file reading!");
        }
        
        //show the arraylist contents
        for(int k=0; k<stuff.size(); k++) {
            System.out.println("stuff index " + k + " --> " + stuff.get(k)  );        
        }
        
    }
            
}
