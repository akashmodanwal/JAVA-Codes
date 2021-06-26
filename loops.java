class loops{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==4)
				continue;
			System.out.println(i*5);	
		}
		int i=1;
		while(i<=10) {
			System.out.println(i*10);
			i++;
		}
		do {
			System.out.println(i);
			i--;
			if(i==4)
				break;
		}while(i>0);
	}
}