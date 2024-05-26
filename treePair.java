class treePair
{
  public static boolean chackPair(int a[],int size, int N){
    for(int i = 0; i < size; i++)
    {
       for(int j = i+1; j < size; j++)
       { 
          for(int k = j + 1; k < size; k++)
          {
             if(a[i]+a[j]+a[k]==N)
             {
                return true;
             }
          }
       }
    }
    return false;
 }

public static void main(String[] args)
{
   int[] arr = {21,42,78,98};
   int size = arr.length;
   int n = 31;
   boolean resu = chackPair(arr,size,n);
   System.out.println(resu);
   
}
}