class outputTypes{
	public static void main(String[] args) {
		String a = "Sanskriti";
		System.out.print(a);
		System.out.print(a);
		System.out.println(" ");
		System.out.println(a);
		System.out.println(a);
		int d=10;
		float PI = 3.14159f;
		System.out.format("value of d is %d\n",d);
		System.out.printf("%2f\n",PI);
		System.out.printf("%3f\n",PI);
		System.out.printf("%7.2f\n",PI); // fill space with empty
		System.out.printf("%07.3f",PI); //fill empty space with 0 or anything
		
	}
}