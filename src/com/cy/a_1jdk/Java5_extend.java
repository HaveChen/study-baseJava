package com.cy.a_1jdk;

public class Java5_extend {

	public static void main(String[] args) {
		// 第一类
		// getString(null);// 方法产生歧义，编译不通过
		// 第二类
		int a = 2, b = 2;
		getInt(a, b);// 方法产生歧义，编译不通过
		// getInt(Integer.valueOf(100));// 方法产生歧义，编译不通过
	}

	// 第一类扩展
	public static void getString(StringBuffer ss) {
		System.out.println("this is getString(StringBuffer ss)");
	}

	public static void getString(String ss) {
		System.out.println("this is getString(StringBuffer ss)");
	}

	// 第二类扩展

	// public static void getInt(int... b) {
	// System.out.println("this is getInt(int a, int b)");
	// }

	public static void getInt(Integer... c) {
		System.out.println("this is getInt(Integer a, Integer b)");
	}
}
