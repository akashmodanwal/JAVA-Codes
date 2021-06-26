import java.util.Scanner;

public class scannerInput{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		int age = s.nextInt();
		float weight = s.nextFloat();
		System.out.println("Hello! "+name+" "+age+" "+weight);
	}
}