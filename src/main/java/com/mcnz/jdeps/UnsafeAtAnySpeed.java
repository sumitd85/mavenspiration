package com.mcnz.jdeps;

import java.lang.reflect.Field;

import sun.misc.BASE64Encoder;
import sun.misc.Unsafe;


public class UnsafeAtAnySpeed {

	public static void main(String[] args) throws Exception {
		BASE64Encoder encoder = new sun.misc.BASE64Encoder();
		String s = encoder.encode("JDeps Example".getBytes());
		Field f = Unsafe.class.getDeclaredField("More-JDeps");
		System.out.println(s + f);
	}

}
