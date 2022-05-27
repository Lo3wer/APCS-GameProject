
public class FileRunner {
    
    public static void main(String[] args) {
        SimpleReader SR = new SimpleReader();
        
        //with readFile, we have to 'try' to readFile since the method possibly throws an exception.  When
        //methods throw exceptions, you have to be prepared to handle the exception.
        try {
            SR.readFile();
        }
        catch(Exception e) {
            System.out.println("Something went wrong reading the file!");
        }
        
        System.out.println("***************************************");
        
        //with readerFile2, the method isn't declared as possibly throwing an exception so
        //we don't have to 'try' to run it.  The exception handling is done inside the method itself.
        //much more convenient for the end user of the SimpleReader class.  Better choice.
        SR.readFile2();
    }
}
