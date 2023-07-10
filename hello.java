class  hello{

	public static void main(String[] args) {
		int j = 0;
		String ss = "ssssss";
		int[] s ={1,2,3};
		while (j<3)
		{
			System.out.print("Hello "+String.valueOf(j) +"  ") ;
			System.out.println(Math.random());
			j++;
		}
		System.out.println(ss.length());
		System.out.println(s.length);
		hello.test();

		hello one = new hello();
		one.test2();

	}
	
	static void test()
	{
		System.out.println("test");
	}

	void test2()
	{
		System.out.println("test2");
	}
}
