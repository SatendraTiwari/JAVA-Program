class SearchElement
{
   public static int search(int a[],int size, int N)
   {
     for(int i = 0; i < size; i++)
     {
        if( a[i]==N)
        {
          System.out.println(a[i]);
        }
     }
     
   }

public static void main(String[] args)
{
  int[] arr = {12,13,14,15};
  int size = arr.length;
  int n = 14;
  search(arr,size,n);
}
}
