package com.tnsif.day2;

public class NestedForLoopProgram {

	public static void main(String[] args) {
		int beg = 2;
		int end = 10;
		
		for (int i = beg; i<= end; i++) {
			for(int j= 1; j<=10; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			
		}
	}

}
