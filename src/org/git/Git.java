package org.git;

public class Git {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5,10};
		
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(i);
		}
		
		for(int x: a) {
			System.out.println(x);
			System.out.println(x);
		}
	}
	
}
