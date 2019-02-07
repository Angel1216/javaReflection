package com.arquitecturajava;

import com.sun.org.apache.regexp.internal.RE;
import com.sun.org.apache.regexp.internal.RESyntaxException;

public class ExpresionRegular {
	
	public static boolean validaAlphanumeric(String dataToValidate) {
	
		boolean flag = false;
		
		if (dataToValidate != null && dataToValidate.trim().length()>=0){
			try {
				RE re = new RE( "^([A-Za-z0-9\\s]+)$" );
				flag = re.match(dataToValidate.trim());
			} catch(RESyntaxException e) {
				e.printStackTrace();
			}
		}
		
		return flag;
	}

	public static void main(String[] args){
		boolean response = validaAlphanumeric("Angel9)");
		System.out.println("response: " + response);
	}
}
