import java.util.Scanner; 
public class AgeApp {
public static void main(String []args) {
	Scanner myObj= new Scanner (System.in);
	int age =myObj.nextInt();
       if(age==18) {
    	   System.out.println("You can drive.");
       }
       if(age%10==0) {
    	   System.out.println("Anniversary Party!!");
    	  if(age==100) {
    		  for(int i=0; i<3; i++) {
    			  System.out.println("Congratulation!");
    		  }
    	  }
    	  
    	  if(age>=40&&age<=50) {
    		  System.out.println("Happy mid-life");
    	  }
       }

}
}
