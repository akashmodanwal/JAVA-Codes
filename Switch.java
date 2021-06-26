import java.util.Scanner;

class Switch{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x =0,y=0;
		char choice = s.next().charAt(0);
		//System.out.println(choice);
		switch(choice) {
		case 'L':
			x--;
			break;
		case 'R':
			x++;
			break;
		case 'U':
			y++;
			break;
		case 'D':
			y--;
			break;
		default:
			System.out.println("Wrong Move");
		
		}
		System.out.println(x+" "+y);
	}
}