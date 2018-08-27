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
    static String[] records;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the filename:");
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        String filename = keyboard.next();
        java.util.Scanner entei = new java.util.Scanner(filename);
        int currentIndex = 0;
        try{
            Scanner reader = new Scanner(new File(args[0]));
        }
        catch (FileNotFoundException ex) {
            System.err.println("Failed to read input file.");
        }
        while(entei.hasNext()){
            String [] line = entei.nextLine().split(",");
            verify(line);
            String firstName = line[0];
            String lastName = line[1];
            String age = line[2];
            String gender = line[3];
            String phoneNumber = line[4];
            String email = line[5];
            
            records[currentIndex] = String.format("%-20s%-20s%-10s%10d%20d%-20s", firstName, lastName, gender, age, phoneNumber, email);
            
            currentIndex++;
        
        }
        for(int i = 0; i <= currentIndex; i++){
            System.out.println(records[i]);
        }
            
        
        
    }

    public static void verify(String[] line) {
            for(int i = 0; i <= line.length; i++){
            
            }
            
    }

  
    
}
