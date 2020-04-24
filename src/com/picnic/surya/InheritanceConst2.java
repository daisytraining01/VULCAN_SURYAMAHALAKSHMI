package com.picnic.surya;

public class InheritanceConst2 extends InheritanceConst
{
	int y=30;
	public void test()
	{
		System.out.println("Ïnside the test() //subclass");
		}


	public static void main(String[] args) {
		InheritanceConst2 ref=new InheritanceConst2();
		
		System.out.println(ref.x);
		ref.disp();
		System.out.println(ref.y);
		ref.test();
		
	}

}
