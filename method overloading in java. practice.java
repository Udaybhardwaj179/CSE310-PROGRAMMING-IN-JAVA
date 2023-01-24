class Billing{
  double newPrice;
  double computeBill(int b){
    newPrice=(b+ 0.08*b);
    return newPrice;
  }
  double computeBill(int a,int b){
    double c=a*b;
    double tax=0.08*c;
    newPrice =c+tax;
    return newPrice;
  }
}
class demo{
  public static void  main(String[] args) {
    Billing o1=new Billing();
    // Billing o2= new Billing();
    System.out.print(o1.computeBill(100));
    System.out.println();
    System.out.print(o1.computeBill(100,20));
  }
}
