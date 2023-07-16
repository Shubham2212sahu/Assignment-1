class B {

	int a=10;
	static int b=20;

	public static void main(String[] args){
		System.out.println("Main exe");

		Display();
		B refer = new B();
		refer.Show();


	}
	static void Display(){
		System.out.println(b);
	}
	void Show(){
		System.out.println(" "+ a + b );
	}
}

