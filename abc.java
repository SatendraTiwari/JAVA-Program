interface xyz
{
  int a = 10;
  void show();
}

interface pqr
{
  int b = 20;
  void sum();
}

class abc implements xyz,pqr
{
  public void show()
  { 
    System.out.println(a+"  "+b);
  }
  public void sum()
  {
    System.out.println(a+b); 
  }  
}

