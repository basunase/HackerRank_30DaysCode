import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            //System.out.println(a[a_i]);
        }
        int len = a.length-1;
        int pos;
        int swap = 0;
        while (len > 0){
            pos = 0;
        for(int i=0; i < len; i++){
           
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    pos = i;
                    swap++;
            }
    }
            len = pos;
}
        System.out.println("Array is sorted in"+" "+ swap +" "+"swaps.");
       
        System.out.println("First Element:"+ " " +a[0]);
        System.out.println("Last Element:"+ " "+a[n-1]);
        
    }
}