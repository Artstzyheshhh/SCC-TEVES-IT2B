
package teves;


public class receipts {
    String Cname, prdname ;
    double quant, price, cash;
    
    public void addreceipt(String rname, String rpname, double rquant, double rprice, double rcash){
        this.Cname = rname;
        this.prdname = rpname;
        this.quant = rquant;
        this.price = rprice;
        this.cash = rcash;
    }
    public void viewreceipt(){
        
        double due = quant*price;
        double change = cash - (quant*price);
        
        
        System.out.printf("\n| %-10s | %-10s | %-10.2f | %-10.2f | %-10.2f | %-10.2f |",
      this.Cname , this.prdname , this.quant, this.price , this.cash , due, change) ;
    
    
    }
    
}
