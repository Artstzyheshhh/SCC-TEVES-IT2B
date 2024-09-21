package teves;

public class grades {
    String name;
    int id;
    double p ,m ,pf, f;

   
  public void addgrades(String sname, int sid, double sp , double sm , double spf , double sf){
      this.name = sname;
      this.id = sid;
      this.p = sp;
      this.m = sm;
      this.pf = spf;
      this.f = sf;
      
  }
  public void viewgrades(){
      
      double total =  this.p + this.m + this.pf + this.f;
      double average = total/4;
      String remarks = (average> 3.0) ? "failed" : "passed";
      
      
      System.out.printf("\n| %-10s | %-10d | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10.2f | %-10s |",
      this.name , this.id , this.p, this.m , this.pf , this.f, average,remarks) ;
  
  }
  

  
}
