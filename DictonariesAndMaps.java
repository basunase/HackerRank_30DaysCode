import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        Map<String,Integer> ph = new  HashMap< String,Integer >();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            ph.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (ph.containsKey(s) == true){
                System.out.println(s + "="+ph.get(s));
            }else{
                System.out.println("Not found");

            }
        }
        in.close();
    }
}
