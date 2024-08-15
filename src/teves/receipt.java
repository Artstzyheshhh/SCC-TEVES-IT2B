
package teves;

import java.util.Scanner;


public class receipt {
     public void getreceipt(){
    Scanner input = new Scanner(System.in);
        String Cname, prdname ;
        int quant, price, cash;
        
        System.out.print("Customer name: ");
        Cname = input.nextLine();
        System.out.print("Product name: ");
        prdname = input.nextLine();
        System.out.print("Quantity : ");
        quant = input.nextInt();
        System.out.print("Price : ");
        price = input.nextInt();
        System.out.print("cash : ");
        cash = input.nextInt();
        
         System.out.println("-------------------------------");
         System.out.println("RECEIPT");
         System.out.println("-------------------------------");
         System.out.println("Name :"+Cname);
         System.out.println("Item :"+prdname);
         System.out.println("Quantity :"+quant);
         System.out.println("-------------------------------");
         System.out.println("Total due :"+(quant*price));
         System.out.println("Cash :"+cash);
         System.out.println("-------------------------------");
         System.out.println("Change :"+(cash-(quant*price));
}
}