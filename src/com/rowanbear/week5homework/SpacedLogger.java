package com.rowanbear.week5homework;

public class SpacedLogger implements Logger{

	
	
	public void Log(String Log) {
		char[] chars = Log.toCharArray();
		StringBuilder str = new StringBuilder();
		
		for (char c : chars) {
			if (c != Log.charAt(Log.length() - 1)) {
				str.append(c + " ");
			} else {
				str.append(c);
			}
			
			
		}
		System.out.println(str);
		
	}

	
	public void Error(String Error) {
		char[] chars = Error.toCharArray();
		StringBuilder str = new StringBuilder();
		
		for (char c : chars) {
			if (c != Error.charAt(Error.length() - 1)) {
				str.append(c + " ");
			} else {
				str.append(c);
			}
			
			
		}
		System.out.println("ERROR: " + str);
	}

}
