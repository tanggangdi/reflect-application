package com.swpu.reflect;

public class test {
	public static void main(String[] args) {
		String s=new String("hello");
		ReflectUtil.printClassMessage(s);
		System.out.println("----------------");
		System.out.println("Methods:");
		ReflectUtil.printMethodMessage(s);
		System.out.println("----------------");
		System.out.println("Field:");
		ReflectUtil.printFieldMessage(s);
		System.out.println("----------------");
		System.out.println("Constructors:");
		ReflectUtil.printConstructorMessage(s);
		System.out.println("----------------");
	}
}
