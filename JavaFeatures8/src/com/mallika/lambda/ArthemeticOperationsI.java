package com.mallika.lambda;

public class ArthemeticOperationsI {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArthematicOperations add=(a,b)->a+b;
        System.out.println(add.show(2, 3));
        ArthematicOperations sub=(a,b)->a-b;
        System.out.println(sub.show(2, 3));
        ArthematicOperations mul=(a,b)->a*b;
        System.out.println( mul.show(2, 3));
	}

}
