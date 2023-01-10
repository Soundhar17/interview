package com.interview;

public class string {

	public static void main(String[] args) {
		String a="sobogofodoroboeonomo";
		
		String[] s=a.split("");
		
		 int o=0;
		
		for(String c : s) {
			
			if(c.equals("o")) {
				
				o++;
				
			}
			
		}
	
		System.out.println(o);	
			
	}
	

	}


