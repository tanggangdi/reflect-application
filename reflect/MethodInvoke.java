package com.swpu.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//要获取print(int,int)方法
		A a1=new A();
		Class c=a1.getClass();
	    /*
	     *2.获取方法 名称 参数列表
	     */
		try {
			Method m=c.getMethod("print", new Class[] {int.class,int.class});
			//方法的反射操作:用m对象来进行操作,和a1.print(0的效果一样
			//方法如果没有返回值返回null，有返回值就返回具体的值
			Object o=m.invoke(a1,10,20);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		try {
			Method ms=c.getMethod("print", String.class,String.class);
			Object o1=ms.invoke(a1, "Hello","World");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class A {
	public void print(int a,int b){
		System.out.println(a+b);
	}
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+","+b.toUpperCase());
	}
}

