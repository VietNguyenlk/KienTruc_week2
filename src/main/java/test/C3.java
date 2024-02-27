package test;

import java.lang.reflect.Method;

public class C3 {
	public static void main(String[] args) throws ClassNotFoundException {
//		User user = new User();
//		Class<? extends User >cls = user.getClass();
		Class<?> clz = Class.forName("test.User");
		Method[] methods=clz.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName()+""+ m.getReturnType());
			
		}
	}
}
