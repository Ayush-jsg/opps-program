package com.m.lang.obj;

public class EqualsDemo3 {
	public static void main(String[] args) {

		String str = new String("monu");
		String str1 = new String("monu");

		System.out.println(str.equals(str1));  //true

		StringBuffer sb = new StringBuffer("ankit");
		StringBuffer sb1 = new StringBuffer("ankit");

		System.out.println(sb.equals(sb1));  // false reference checking
	}

}
