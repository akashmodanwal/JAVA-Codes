import java.io.*;

public class Input {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name!!");
		String name = br.readLine();
		System.out.println("Enter Your Age!");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Hello "+ name+"!!");
		System.out.println("Your age is "+age);
	}
}
