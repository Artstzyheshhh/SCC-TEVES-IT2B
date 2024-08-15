
package teves;

import java.util.Scanner;


public class ageCalcu {
    public void getAge(){
 Scanner input = new Scanner(System.in);
    
        String fname ;
        int byear;
        
        System.out.print("Enter your name: ");
        fname = input.nextLine();
         System.out.print("Enter your year: ");
        byear = input.nextInt();
        
        
        System.out.println("hello"+fname+"\nYour age is "+(2024-byear));
}}