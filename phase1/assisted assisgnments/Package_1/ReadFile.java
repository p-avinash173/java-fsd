package Package_1;

import java.io.File;   
import java.io.FileNotFoundException;   
import java.util.Scanner;   

public class ReadFile {

	public static void main(String[] args) {  
        try {  
            
            File f1 = new File("D:FileOperationCreate.txt");    
            Scanner dataReader = new Scanner(f1);  
            while (dataReader.hasNextLine()) {  
                String fileData = dataReader.nextLine();  
                System.out.println(fileData);  
            }  
            dataReader.close();  
        } catch (FileNotFoundException exception) {  
            System.out.println("Unexcpected error occurred!");  
            exception.printStackTrace();  
        }  
    }  
}
