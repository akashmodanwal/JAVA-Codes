import java.util.Scanner;

class sumOfNatural{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		if(n<0) {
			System.out.println("Error");
			return ;
		}
		long sum = n*(n+1)/2;
		System.out.printf("Sum of %d Natural Numbers is : %d",n,sum);
	}
}