/*
 * Lance Davis
 * August 27, 2018
 * Lab 2
 */
package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author lndavis6
 */
public class Lab2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] record = new String[100];
        try{
            Scanner reader = new Scanner(new File(args[0]));
            int index = 0;
            while(reader.hasNext()){
                String [] line = reader.nextLine().split(",");
                String fName = line[0];
                String lName = line[1];
                String age = line[2];
                String gender = line[3];
                String pNumber = line[4];
                String email = line[5];
                
                record[index] = String.format("");
                
                index++;
                
                String result;
                result = String.format("%-20s%-20s%-10s%10s%-15s%-30s", fName, lName, age, gender, pNumber, email);
                System.out.println(result);
            }
        
        }
        catch(FileNotFoundException ex){
            System.err.println("Failed to read file");
        }
    
    }
            
    }

  
    

