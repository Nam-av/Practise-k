package com.sample;

public class VariableScope {
    static int x1=3; //class scope
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=1;
    System.out.println(x);
    dosomething();
     
	}
	 static void dosomething() {
	 int x=2;//local scope
	 System.out.println(x);
	 System.out.println(x1);//global scope
	 }

}
