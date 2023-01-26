import java.util.Arrays;

public class Main {
    public static int swapCount=1;
    public static int[] arr = {7, 2, 5, 8, 9, 4, 15, 1,23,77,32,4,55,33,82,3,12};
    public static void main(String[] args) {
        int ii=0;
        while(swapCount>0)
        {
            System.out.println(ii+"::");
            Print();
            Short();
            ii+=1;
        }
    }
    public static void Short()
    {
        swapCount=0;
        int n=arr.length-1;
        for(int i=0;i<n;i++)
        {
            Swap(i+0,i+1);
            if((n-1-i)>0)
            {
                Swap((n-1)-i,n-i);
            }
        }
    }
    public static void Swap(int a,int b)
    {
        if(arr[a]>arr[b])
        {
            int swp=arr[a];
            arr[a]=arr[b];
            arr[b]=swp;
            swapCount+=1;
        }
    }
    public static void Print()
    {
        System.out.println(Arrays.toString(arr));
    }
}



