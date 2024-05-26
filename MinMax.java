import java.util.Scanner;

class MinMAx
{
    int a,b;
    void setValue()
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a size of array  :");
        int size = sc.nextInt();

        int ar[] = new int[size];

        System.err.println("Enter a element oF ARRAY : ");
        for(int i = 0; i < size;i++){
            ar[i] = sc.nextInt();
        }
        
    }
}


class MainMinMax
{
    public static void main(String[] args) {
        MinMAx m1 = new MinMAx();
        m1.setValue();
    }
}