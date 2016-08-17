import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int j;
            double k;
            String str;
            j = scan.nextInt();
            k = scan.nextDouble();
            String c = scan.nextLine();
            str = scan.nextLine();
            System.out.println(i + j);
            System.out.println(d + k);
            System.out.println(s.concat(str));
               scan.close();
    }
}