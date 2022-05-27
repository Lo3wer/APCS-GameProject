import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/* quick sample of how to write and read from a text file
 * note: no error handling in this example! 
 * John Janetka
 */

public class SampleReadWrite {

    public static void main(String[] args) throws Exception {
        //setup filename
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Your directory is " + currentDirectory);
        String fullFileName = currentDirectory + "/abc.txt";
        System.out.println("The file path is " + fullFileName);
        
        //set up buffered reader
        FileReader fr = new FileReader(fullFileName);
        BufferedReader br = new BufferedReader(fr);
        
        //do the reading (print out and save into list)
        ArrayList<String> stuff = new ArrayList();
        String line="";
        while( (  line = br.readLine()  ) != null) {
            System.out.println("Just read: " + line);
            stuff.add(line);
        }
        
        br.close();
        
        //show the arraylist contents
        for(int k=0; k<stuff.size(); k++) {
            System.out.println("stuff index " + k + " --> " + stuff.get(k)  );
        }
      
        
      } //main
} //class
