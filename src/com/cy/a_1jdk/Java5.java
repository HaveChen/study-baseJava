package com.cy.a_1jdk;

/**
 * 
 * java���ԣ�jdk1.5�����������
 * 
 * @autho chenyou
 * @time 2018��12��11�� ����2:32:50
 */
public class Java5 {

	public static void main(String[] args) {
		// 1.�����˷���<T>��https://blog.csdn.net/budapest/article/details/1677980
		// 2.����ö�٣�ö������ Enumeration
		// 3.�Զ�װ����䣨�Զ����Ͱ�װ�ͽ����autoboxing &unboxing:
		// ��https://www.cnblogs.com/dolphin0520/p/3780005.html
		// �Զ�װ�������������Զ�תΪ��װ�ࣨint ����Integer��
		Integer i = 10;// �Զ�
		Integer i1 = new Integer(100);
		// �Զ��������װ���Զ�תΪ�������ͣ�Integer����int��
		int n = i;// ����
		// int n = i.intValue();
		Integer a = 100;
		// �����Integer a = Integer.valueOf(100);
		Integer b = 100;
		Integer c = 200;
		Integer d = 200;
		// System.err.println(i1 == a);// false
		// System.err.println(n == a);// false
		// System.err.println(a == b);// true
		// System.err.println(c == d);// false Inerger -128~127

		Double ad = 100.0;
		Double bd = 100.0;
		Double cd = 200.0;
		Double dd = 200.0;

		// ע�⣬Integer��Short��Byte��Character��Long�⼸�����valueOf������ʵ�������Ƶġ�
		// Double��Float��valueOf������ʵ�������Ƶ�
		System.err.println(ad == bd);// false
		System.err.println(cd == dd);// false
		// Double.valueOf(100);

		boolean ab = false;
		boolean bb = false;
		System.out.println("booean:" + (ab == bb)); // true
		Boolean.valueOf(ab);

		// 4.�ɱ����varargs:https://www.cnblogs.com/uptownBoy/articles/1698335.html
		// test(12, "sdas", 1, 11111);
		// test(new Object[] {Integer.valueOf(12), "sdas", Integer.valueOf(1),
		// Integer.valueOf(11111) });
		// ���Է������ص����ȼ���ʵ�θ����̶��İ汾������ʵ�θ����ɱ�İ汾��
		// test(12);
		// test(12, 12);// The method test(Object[]) is ambiguous for the type
		// Java5--����������

	}
	// ���巽��
	// public static void test(Object ss, Object... s) {
	// System.err.println("this is test(Object ss, Object... s)");
	// }

	// 4.�ɱ����varargs
	public static void test(Object... ss) {
		for (Object object : ss) {
			System.err.println(object.toString());
		}
		// Object[] arrayOfObject = ss;int j = ss.length;
		// for (int i = 0; i < j; i++)
		// {
		// Object object = arrayOfObject[i];
		// System.err.println(object.toString());
		// }
	}

	public static void test(Object ss) {
		System.err.println("this is test(Object ss)");
	}

}
