package com.swpu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {
	public static void printClassMessage(Object obj){
		//获取类的名称
		System.out.println("类的名称为："+obj.getClass());
	}
	
	public static void printMethodMessage(Object obj){
		Class c1=obj.getClass();
		//获取该类中拥有的方法
		//Method[] ms1=c1.getMethods();//获取的是public以及父类中的方法
		Method[] ms=c1.getDeclaredMethods();//获取所有方法，不管方法的权限
		for(Method m:ms){
			//获取返回值的类型
			Class returnType=m.getReturnType();
			System.out.print(returnType+" ");
			//获取方法的名字
			System.out.print(m.getName()+"(");
			//获取参数列表
			Class[] ParamTypes=m.getParameterTypes();
			for(Class param:ParamTypes){
				System.out.print(param.getName()+",");
			}
			System.out.println(")");
		}
	}
	public static void printFieldMessage(Object obj){
		Class c1=obj.getClass();
		//获取该类中的成员变量
		Field[] fs=c1.getDeclaredFields();
		for(Field f:fs){
			//获取成员变量的类类型
			Class returnType=f.getType();
			String TypeName=returnType.getName();
			System.out.println(TypeName+"("+f.getName()+")");
		}
	}
	public static void printConstructorMessage(Object obj){
		Class c1=obj.getClass();
		//获得该类的构造函数
		Constructor[] cons=c1.getDeclaredConstructors();
		for(Constructor con:cons){
			//获取构造函数的名字
			System.out.print(con.getName()+"(");
			//获取参数列表
			Class[] returnType=con.getParameterTypes();
			for(Class class1:returnType){
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
}
