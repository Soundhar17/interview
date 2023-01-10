package com.interview;

public class six {
	
	public static void main(String[] args) {
		
		int[] a= {0,1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				
				int c=a[i]+a[j];
				
			if(c==6)	{
				
				System.out.println(a[i]+"  "+a[j]);
				
			}
				
			}
					
		}
		
		}
	}

