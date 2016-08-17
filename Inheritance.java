import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
    private int[] testScores;
   //private int id;
    private int sum = 0;
    private int result = 0;
    String ans;
    
    public Student(String firstName, String lastName, int ide, int[] testScores)
        {
        super(firstName, lastName, ide);
        this.testScores = testScores;
      
    }
    public String calculate()
        {
        for(int i = 0; i < testScores.length; i++){
            sum = sum + testScores[i];
		}
        
        result = sum/testScores.length;
        if(result >= 90 && result <= 100 )
            {
            ans = "O";
        } else if(result >= 80 && result < 90 ) {
             ans=  "E";
        }
        else if(result >= 70 && result < 80 ) {
             ans = "A";
        } else if(result >= 55 && result < 70 ) {
             ans = "P";
        } else if(result >= 40 && result < 55 ) {
             ans =  "D";
        } else if(result < 40 ) {
             ans = "T";
        }
          return ans;
    }
}
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
