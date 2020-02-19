package sorting;

import java.util.Arrays;

public class AlternativeSorting {
    public static void alternativesort(int [] arr,int size){
        Arrays.sort(arr);

        int i=0,j=size-1;
        while(i<=j)
        {
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
            if(size%2!=0)
            {
                System.out.print(arr[i]);
            }
        }




    }
    public static void main (String [] str)
    {
        int [] arr={3,2,4,7,9,12,29,22};
        int size=arr.length;
        alternativesort(arr,size);
    }
}
