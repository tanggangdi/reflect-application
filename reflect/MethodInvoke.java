package com.swpu.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvoke {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//Ҫ��ȡprint(int,int)����
		A a1=new A();
		Class c=a1.getClass();
	    /*
	     *2.��ȡ���� ���� �����б�
	     */
		try {
			Method m=c.getMethod("print", new Class[] {int.class,int.class});
			//�����ķ������:��m���������в���,��a1.print(0��Ч��һ��
			//�������û�з���ֵ����null���з���ֵ�ͷ��ؾ����ֵ
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

