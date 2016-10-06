import java.lang.reflect.Method;

class Solution {
     static <V> void printArray(V[] arr){
        for(V i : arr){
            System.out.println(i);
        }
    }
     public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}