package com.arquitecturajava;

public final class Outer {
	
	private static int x = 6;
	private String name = "hola";
	public String roko = "roko";

	private class Inner {
		void print(){
			System.out.println(x);
			System.out.println(name);
			System.out.println(roko);
		}
	}
	
	public static void main(String[] args){
		new Outer().new Inner().print();
	}

}
