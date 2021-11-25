package SearchnSort;

import java.util.ArrayList;


public class firstnLastOccArrayList {

    public static int first(ArrayList list, int x)
    {
        // return first occurrence index
        // of element x in ArrayList
        // using method indexOf()
        return list.indexOf(x);
    }

    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> a = new ArrayList<>();

        for(int i=0; i<n; i++){
            a.add(arr[i]);
            System.out.println(arr[i]);
        }
        System.out.println(a);

        int first = a.indexOf(x);
        System.out.println(first(a, x));
        long last = a.lastIndexOf(x);

        ArrayList<Long> fin = new ArrayList<>();
        if(first != 0 && last != 0) {
            fin.add((long) first);
            fin.add((long) last);
        }
        else fin.add((long) -1);

        return fin;
        // code here
    }

    public static void main(String args[]){
        firstnLastOccArrayList f = new firstnLastOccArrayList();
        long[] arr = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        System.out.println(f.find(arr, 10, 2));
    }
}
