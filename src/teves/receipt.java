
package teves;

import java.util.Scanner;


public class receipt {
     public void getreceipt(){
    Scanner sc = new Scanner(System.in);
    receipts[] rc = new receipts[100];
        
        int quant, price, cash;
        
        System.out.print("Enter no of customer: ");
    int cus = sc.nextInt();
        
    for(int i=0; i<cus; i++){
        rc[i] = new receipts();
        System.out.println("Enter details of customer "+(i+1)+": ");
        System.out.print("Customer name: ");
        String Cname = sc.next();
        System.out.print("Product name: ");
        String prdname = sc.next();
        System.out.print("Quantity : ");
        quant = sc.nextInt();
        System.out.print("Price : ");
        price = sc.nextInt();
        System.out.print("cash : ");
        cash = sc.nextInt();
        rc[i].addreceipt(Cname, prdname, quant, price, cash);
    }
    System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s | %-10s |",
    "CUSTOMER", "PRODUCT" , "QUANTITY" , "CASH" ,"PRICE","TOTAL DUE","CHANGE" ) ;    
   for(int i=0; i<cus; i++){
   rc[i].viewreceipt();
   
   }    
    
}
}