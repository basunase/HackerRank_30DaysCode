import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();

        for (int j = 0; j < n; j++){
             boolean ispri = true;
            int num = sc.nextInt();
            if (num == 1){
                ispri = false;
            }
            for (int i = 2; i <= num/2; i++){
                int temp = num%i;
                if (temp == 0){
                    ispri = false;
                    break;
                }
            }
            if(ispri)
                System.out.println("Prime");
            else
                System.out.println("Not prime");
            
        }
    }   
}

