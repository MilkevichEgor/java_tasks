package org.example.interview.oop.service;

public interface MyInterfaceJDK9 {

  String COMMON_MESSAGE = "Common behavior goes here";
  String STATIC_MESSAGE = "Common static behavior goes here";

  void nonDefaultMethod();

  default void defaultMethod1() {
	commonPrivateMethod();
	commonPrivateStaticMethod();
  }

  default void defaultMethod2() {
	commonPrivateMethod();
	commonPrivateStaticMethod();
  }

  private void commonPrivateMethod() {
	System.out.println(COMMON_MESSAGE);
  }

  private static void commonPrivateStaticMethod() {
	System.out.println(STATIC_MESSAGE);
  }
}
