class C_Addition {

	void Add(int a, int b){
		int c = a + b;
		System.out.println(c);
	}

	static void Sum(int d, int e){
		int f = d + e;
		System.out.println(f);
	}
	
	public static void main(String[] args){
		C_Addition.Sum(2,3);

		C_Addition Ref = new C_Addition();
		Ref.Add(7,8);

	}
}
