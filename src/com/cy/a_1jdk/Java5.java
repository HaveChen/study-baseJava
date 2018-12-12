package com.cy.a_1jdk;

/**
 * 
 * java特性：jdk1.5引入的新特性
 * 
 * @autho chenyou
 * @time 2018年12月11日 下午2:32:50
 */
public class Java5 {

	public static void main(String[] args) {
		// 1.加入了泛型<T>：https://blog.csdn.net/budapest/article/details/1677980
		// 2.加入枚举：枚举类型 Enumeration
		// 3.自动装箱拆箱（自动类型包装和解包）autoboxing &unboxing:
		// 、https://www.cnblogs.com/dolphin0520/p/3780005.html
		// 自动装包：基本类型自动转为包装类（int ——Integer）
		Integer i = 10;// 自动
		Integer i1 = new Integer(100);
		// 自动拆包：包装类自动转为基本类型（Integer——int）
		int n = i;// 拆箱
		// int n = i.intValue();
		Integer a = 100;
		// 编译后：Integer a = Integer.valueOf(100);
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

		// 注意，Integer、Short、Byte、Character、Long这几个类的valueOf方法的实现是类似的。
		// Double、Float的valueOf方法的实现是类似的
		System.err.println(ad == bd);// false
		System.err.println(cd == dd);// false
		// Double.valueOf(100);

		boolean ab = false;
		boolean bb = false;
		System.out.println("booean:" + (ab == bb)); // true
		Boolean.valueOf(ab);

		// 4.可变参数varargs:https://www.cnblogs.com/uptownBoy/articles/1698335.html
		// test(12, "sdas", 1, 11111);
		// test(new Object[] {Integer.valueOf(12), "sdas", Integer.valueOf(1),
		// Integer.valueOf(11111) });
		// 测试方法重载的优先级（实参个数固定的版本优先于实参个数可变的版本）
		// test(12);
		// test(12, 12);// The method test(Object[]) is ambiguous for the type
		// Java5--方法有歧义

	}
	// 歧义方法
	// public static void test(Object ss, Object... s) {
	// System.err.println("this is test(Object ss, Object... s)");
	// }

	// 4.可变参数varargs
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
