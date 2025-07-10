package com.sample;

public class Overloadedstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String pizza=bakepizza("flat bread", "cream cheese","pepparoni");
     System.out.println(pizza);
	}
    static String bakepizza(String bread)
    {
    	return bread+" pizza";
    }
    static String bakepizza(String bread,String cheese)
    {
    	return cheese +" "+bread + " pizza";
    }
    static String bakepizza(String bread,String cheese,String topping) 
    {
    	return cheese +" "+bread + " pizza" + " with " +topping +" topping";
    }
}
