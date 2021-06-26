class Point{
	int x; //default value if not initialized
	int y;
}
//int x;  if accesed compiler error

public class nonprimitive {
	public static void main(String[] args) {
		Point p= new Point();
		p.x = 2;
		p.y = 3;
		System.out.println(p.x+" "+p.y);
		Point p2 = p;
		System.out.println(p2.x+" "+p2.y);
		p2.x= 20;
		System.out.println(p.x+" "+p2.x);
		char a ='A';
		char b =a;
		a = 'b';
		System.out.println(a+" "+b);
	}
	
}
//non-primitive heap
//primitive -stack

