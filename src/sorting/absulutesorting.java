package sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class absulutesorting {
    public static void rearrange(int arr[],int x,int n){
        TreeMap<Integer, ArrayList<Integer>> m=new TreeMap<>();
       for(int i=0;i<n;i++) {
           int diffrence = Math.abs(x - arr[i]);
           if (m.containsKey(diffrence)) {
               ArrayList<Integer> al = new ArrayList<>();
               al.add(arr[i]);
               m.put(diffrence, al);
           } else {
               ArrayList<Integer> al = new ArrayList();
               al.add(arr[i]);
               m.put(diffrence, al);
           }
       }
           int index=0;
                   for(Map.Entry entry:m.entrySet())
                   {
                       ArrayList<Integer> al=m.get(entry.getKey());
                       for(int i=0;i<al.size();i++){
                           arr[index++] = al.get(i);
                       }
                   }
    }

    static void printarray(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String [] args)
    {
        int arr[]={10,5,4,1,7};
        int x=6;
        int n=arr.length;
        rearrange(arr,x,n);
        printarray(arr,n);
    }
}
