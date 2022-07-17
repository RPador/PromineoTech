
public class lab1 {

	public static void main(String[] args) {
		int age = 15;
		age = 17;
		System.out.println(age >= 16);
		
		boolean hasLicense = true;
		
if (age >= 16 && hasLicense) {
	System.out.println("You can drive");
	
} else {
	System.out.println("You cannot drive");
	
	
	}
double costofMilk =  4.59;
int thirstLevel = 5;
if (costofMilk <= 2.50 || thirstLevel > 6) {
	System.out.println("Milk Please");
	
	} else {
		System.out.println("No Thanks");

	
}
int numberofCookies = 5;
int numberofChildren = 6;
int remainingCookies = numberofCookies % numberofChildren;

	
if (remainingCookies >= 5) {
	System.out.println("Jackpot!");
} else if (numberofCookies % numberofChildren >= 2) {
	System.out.println("Woohoo!");
} else if (numberofCookies % numberofChildren > 0) {
	System.out.println("Yes!");
	}
	}
String loyaltyMemberStatus = "Silver";


}


