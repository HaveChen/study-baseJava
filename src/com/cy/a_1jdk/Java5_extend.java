package com.cy.a_1jdk;

public class Java5_extend {

	public static void main(String[] args) {
		// ��һ��
		// getString(null);// �����������壬���벻ͨ��
		// �ڶ���
		int a = 2, b = 2;
		getInt(a, b);// �����������壬���벻ͨ��
		// getInt(Integer.valueOf(100));// �����������壬���벻ͨ��
	}

	// ��һ����չ
	public static void getString(StringBuffer ss) {
		System.out.println("this is getString(StringBuffer ss)");
	}

	public static void getString(String ss) {
		System.out.println("this is getString(StringBuffer ss)");
	}

	// �ڶ�����չ

	// public static void getInt(int... b) {
	// System.out.println("this is getInt(int a, int b)");
	// }

	public static void getInt(Integer... c) {
		System.out.println("this is getInt(Integer a, Integer b)");
	}
}
