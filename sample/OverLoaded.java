package com.sample;

public class OverLoaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(add(1,2,3));
	}
    static float add(float a,float b)
    {
    	return a+b;
    }
    static double add(float a,float b,float c)
    {
    	return(a+b+c);
    }
}
