package com.epam.tddjunit;

public class Remove1st2AChars {

	public String remove(String string) {
		StringBuilder sb =new StringBuilder(string);
		if(string.charAt(0)=='A' && string.charAt(1)=='A')
		{
			sb.deleteCharAt(0);
			sb.deleteCharAt(0);
		}
		else {
		if(string.charAt(0)=='A')
			sb.deleteCharAt(0);
		if(string.charAt(1)=='A')
			sb.deleteCharAt(1);
		}
		String result=sb.toString();
		return result;
	}

}
