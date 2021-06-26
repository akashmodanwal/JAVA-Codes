import java.util.Scanner;

class inputType{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		if(n==0) {
			System.out.println("Number is Zero");
		}
		else if(n>0) {
			if(n%2==0) {
				System.out.println("Number is Positive Even");
			}
			else {
				System.out.println("Number is Positive Odd");
			}
		}
		else {
			if(n%2==0) {
				System.out.println("Number is Negative Even");
			}
			else {
				System.out.println("Numbe is Negative Odd");
			}
		}
	}
}