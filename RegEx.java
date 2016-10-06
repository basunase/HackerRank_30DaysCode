import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
         String regx = "@gmail.com$";
        Pattern p = Pattern.compile(regx);
        List <String> names = new ArrayList<String>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if(m.find()){
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for(String name : names){
            System.out.println(name);
        }
       
        
    }
}
