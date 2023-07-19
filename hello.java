class  hello{

	String   _s1;

	public static void main(String[] args) {
		int j = 0;
		String ss =  new String("ssssss");
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

		j = s[1];

		hello one = new hello();
		one._s1 = "s1";
		one.test2(one._s1);

		qsbjava2 qj = new qsbjava2("dd");
		qj.pp();
		int intok = qj.ok;
		System.out.println(intok );
		qj.pf(0);
		qj.pf2();

	}
	
	static void test()
	{
		System.out.println("test " );
	}

	void test2(String ss)
	{
		System.out.println("test2  " + ss + _s1);
	}
}
