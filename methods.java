class methods{
	public static void main(String[] args) {
		int x = 6;
		System.out.println(fact(x));
		Point p = new Point();
		fun(p);
		System.out.println(p.x+" "+p.y);
	}
	public static int fact(int x) {
		if(x==1)
			return 1;
		return	x*fact(x-1);
	}
	public static void fun(Point p) {
		p.x=10;
		p.y=20;
	}
	//non-primitive datatypes are passed as reference so they can be changed in th function
	
}
class Point{
	int x;
	int y;
}