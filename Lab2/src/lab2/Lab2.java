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
                
                if (verify1(fName, lName) != false && verify2(gender) != false && verify3(age) != false && verify4(pNumber) != false && verify5(email) != false){
                    String result;
                    result = String.format("%-20s%-20s%-10s%10s%-15s%-30s", fName, lName, age, gender, pNumber, email);
                    System.out.println(result);
                    index++;
                }
                
                
            }
        
        }
        catch(FileNotFoundException ex){
            System.err.println("Failed to read file");
        }
    
    }
    /**
     * 
     * @param firstName inputs a string and verifies if it is made up of all letters or not
     * @param lastName inputs a string and verifies if it is made up of all letters or not
     * @return 
     */
    public static boolean verify1(String firstName, String lastName) {
        int i;
        int j;
        boolean tell = true; //changes based on whether the strings have numbers in them or not
     
        for(i = 0; i < firstName.length(); i++){
            if (!Character.isLetter(firstName.charAt(i))){
            tell = false;
            }
        }
        for(j = 0; j < lastName.length(); j++){
            if (!Character.isLetter(lastName.charAt(j))){
            tell = false;
            }
        }
        return tell;
    }
    /**
     * 
     * @param sex inputs a string gender and verifies if it says male or female
     * @return 
     */
    public static boolean verify2(String sex){
        boolean tell = true; //changes based on whether the strings have numbers in them or not
        if(!sex.equalsIgnoreCase("male") || !sex.equalsIgnoreCase("female")){
            tell = false;
        }
        return tell;
    }
    /**
     * 
     * @param age inputs a string that parses to a number that should be between 1 and 130
     * @return 
     */
    public static boolean verify3(String age){
        boolean tell = true; //changes based on whether the strings have numbers in them or not
        try {
            int ageInt = Integer.parseInt(age);
            if(ageInt < 1 || ageInt > 130){
            tell = false;
        }
        }
        catch(NumberFormatException ex) {
            tell = false;
        }
        return tell;
    }
    /**
     * 
     * @param pNumber inputs...
     * @return 
     */
    public static boolean verify4(String pNumber){
            boolean tell = true; //changes based on whether the strings have numbers in them or not
        try {
            int pNum = Integer.parseInt(pNumber);
            if (pNum != 10){
                tell = false;
            }
        }
        catch(NumberFormatException exo){
            tell = false;
        }
        return tell;
    }
    /**
     * 
     * @param email inputs an email address and verifies if it is made up of legal characters or not
     * @return 
     */
    public static boolean verify5(String email){
         boolean tell = true; //changes based on whether the strings have numbers in them or not
        String [] emails = email.split("");
        if (!Character.isLetter(email.charAt(0))){
            tell = false;
        }
        else{
        
        for (int o = 0; o < emails.length; o++){
            
//               if (!Character.isLetter(emails[o]) && !Character.isDigit(emails[0]) && !emails[o].equals(".") && !emails[o].equals("@")){
                if (!emails[o].contentEquals("[a-zA-Z1234567890@.]") ){
                    tell = false;
                 }
               
               }
       
        }
         return tell;
    }
        
    }
 
    

  
    

