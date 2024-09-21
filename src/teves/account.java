package teves;

import java.util.Scanner;

public class account {
Scanner sc = new Scanner(System.in);
accounts[] acc = new accounts[100];
public void getaccnt(){  
   
    System.out.print("Enter no of accounts: ");
    int accnt = sc.nextInt();
    
    for(int i=0; i<accnt; i++){
        
        acc[i] = new accounts();
        System.out.printf("-------------------------------------------------------------------------------\n");
        System.out.println("Enter details of account "+(i+1)+": ");
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
         if(duplicateVerify(id, i)){
                i--;
                continue;
            }
        System.out.print("Enter last name: ");
        String last = sc.next();
        System.out.print("Enter first name: ");
        String first = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();
        System.out.print("Enter username: ");
        String user = sc.next();
        
        System.out.printf("-------------------------------------------------------------------------------");
        System.out.println("\nPASSWORD CRITERIA"
                    + "\n1. Must be above 8 characters"
                    + "\n2. Must have at least 1 upper & 1 lower case letters"
                    + "\n3. Must have at least 1 number"
                    + "\n4. Must have at least 1 special character"
                    + "\n5. Must not have common password names like 'admin', password', and '1234'");
            
        System.out.print("Enter password: ");
        String pass = sc.next();
        
        while(!passwordVerify(pass)){
                System.out.print("\nenter again: ");
                pass = sc.next();
            }
        
        acc[i] = new accounts();
        acc[i].addaccounts(id, last, first, email, user, pass);
    }
       System.out.printf("\n-------------------------------------------------------------------------------\n");
       System.out.printf(" %-10s | %-10s | %-10s | %-10s | %-10s | %-10s ",
      "ID", "firstname" , "lastname" , "email" , "username" ,"password") ;
       System.out.printf("\n-------------------------------------------------------------------------------");
      for(int i=0; i<accnt; i++){
      acc[i].viewaccounts();
      }
     System.out.printf("\n-------------------------------------------------------------------------------");
    }
   private boolean duplicateVerify(int Id, int index){
        for(int j = 0; j < index; j++){
            if(Id==acc[j].nid){
                System.out.println("\nInput invalid, must not match an existing ID.");
                return true;
            } 
        }
        return false;
    }     



private boolean passwordVerify(String password){
    
    boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialchar = false;
        
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c)){
            hasLowercase = true;
            } else if(Character.isUpperCase(c)){
            hasUppercase = true;
            } else if(Character.isDigit(c)){
            hasDigit = true;
            } else if(!Character.isLetterOrDigit(c)){
            hasSpecialchar = true;
            }
        }
    
        if(!(password.length() > 8)){
            System.out.println("\nPassword is invalid, password must be above 8 characters");
            return false;   }
        else if(password.equals("admin") || password.equals("password") || password.equals("1234")){
           System.out.println("\nPassword is invalid, password must not contains common passwords like 'admin', 'password', and '1234'");
           return false;   }  
        else if(!(hasUppercase && hasLowercase)){
            System.out.println("\nPassword is invalid, must have 1 upper and l lower case letters");
            return false;
            } else if(!hasDigit){
            System.out.println("\nPassword is invalid, must have at least 1 number");
            return false;
            } else if(!hasSpecialchar){
            System.out.println("\nPassword is invalid, must have at least 1 special character");
            return false;
            }
            return true;
    }
    

}

