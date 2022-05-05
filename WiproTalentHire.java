//Program on Conditions
//To Check whether student is eligible for Wipro Talent Next
import java.util.*;
class WiproTalentHire{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter 10th Percentage");
		float ten=sin.nextFloat();
		System.out.println("Enter 12th percentage");
		float twle=sin.nextFloat();
		System.out.println("Enter B.tech Percentage upto 3-1");
		float btech=sin.nextFloat();
		if(ten>=65 && twle>=65 &&btech>=65){
			System.out.println("You are Lucky,You are eligible for Wipro Talent Next");
		    System.out.println("This training makes you good Java Engineer");
		}
        else{
             System.out.println("Wipro Talent Next students share knowledge to you");
             System.out.println("Keep your effort to become good Java programmer");			 
		}
	}
}
/*
F:\BHAVAWIPRO23>javac WiproTalentHire.java

F:\BHAVAWIPRO23>java WiproTalentHire
Enter 10th Percentage
92
Enter 12th percentage
94.3
Enter B.tech Percentage upto 3-1
78.29
You are Lucky,You are eligible for Wipro Talent Next
This training makes you good Java Engineer

F:\BHAVAWIPRO23>java WiproTalentHire
Enter 10th Percentage
55
Enter 12th percentage
75
Enter B.tech Percentage upto 3-1
62
Wipro Talent Next students share knowledge to you
Keep your effort to become good Java programmer
*/	