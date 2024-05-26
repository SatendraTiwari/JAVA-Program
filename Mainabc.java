class Mainabc
{
  public static void main(String ar[])
  { 
    abc a1 = new abc();
    
    a1.show(); 
    a1.sum();

    //xyz x1 = new xyz();
    xyz x1;
    //x1.show();
    x1 = a1 ; // Dynamic method dispatch
    x1.show();
    //x1.sum(); //variable x1 of type xyz
    pqr p1;
    p1 = a1;

    p1.sum();
   
  }
}