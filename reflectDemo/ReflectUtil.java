package com.swpu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {
	public static void printClassMessage(Object obj){
		//��ȡ�������
		System.out.println("�������Ϊ��"+obj.getClass());
	}
	
	public static void printMethodMessage(Object obj){
		Class c1=obj.getClass();
		//��ȡ������ӵ�еķ���
		//Method[] ms1=c1.getMethods();//��ȡ����public�Լ������еķ���
		Method[] ms=c1.getDeclaredMethods();//��ȡ���з��������ܷ�����Ȩ��
		for(Method m:ms){
			//��ȡ����ֵ������
			Class returnType=m.getReturnType();
			System.out.print(returnType+" ");
			//��ȡ����������
			System.out.print(m.getName()+"(");
			//��ȡ�����б�
			Class[] ParamTypes=m.getParameterTypes();
			for(Class param:ParamTypes){
				System.out.print(param.getName()+",");
			}
			System.out.println(")");
		}
	}
	public static void printFieldMessage(Object obj){
		Class c1=obj.getClass();
		//��ȡ�����еĳ�Ա����
		Field[] fs=c1.getDeclaredFields();
		for(Field f:fs){
			//��ȡ��Ա������������
			Class returnType=f.getType();
			String TypeName=returnType.getName();
			System.out.println(TypeName+"("+f.getName()+")");
		}
	}
	public static void printConstructorMessage(Object obj){
		Class c1=obj.getClass();
		//��ø���Ĺ��캯��
		Constructor[] cons=c1.getDeclaredConstructors();
		for(Constructor con:cons){
			//��ȡ���캯��������
			System.out.print(con.getName()+"(");
			//��ȡ�����б�
			Class[] returnType=con.getParameterTypes();
			for(Class class1:returnType){
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
}
