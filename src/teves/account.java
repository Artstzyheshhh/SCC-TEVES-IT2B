package teves;

import java.util.Scanner;
public class account {

public void getaccnt(){  
    Scanner sc = new Scanner(System.in);
    accounts[] acc = new accounts[100];
   
    
    System.out.print("Enter no of accounts: ");
    int accnt = sc.nextInt();
    
    for(int i=0; i<accnt; i++){
        
        acc[i] = new accounts();
        
        System.out.println("Enter details of account "+(i+1)+": ");
        System.out.print("Enter ID:");
        String id = sc.next();
        System.out.print("Enter last name:");
        String last = sc.next();
        System.out.print("Enter first name:");
        String first = sc.next();
        System.out.print("Enter email:");
        String email = sc.next();
        System.out.print("Enter username:");
        String user = sc.next();
        System.out.print("Enter password:");
        String pass = sc.next();
        
        acc[i].addaccounts(id, last, first, email, user, pass);
    }
      for(int i=0; i<accnt; i++){
      acc[i].viewaccounts();
      
      
      }
    
    }
    
    
}

