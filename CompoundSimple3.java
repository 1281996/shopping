package com.mallika.ds;

public class CompoundSimple3 {
	double si=0.0;
	double ci=0.0;
	public void getCalInterest(double p,double t,double r){
		si=(p*t*r)/100;
		ci=p*(Math.pow((1+r/100),t));
		System.out.println("ci "+ci);
		System.out.println("si "+si);
		
	}

}
