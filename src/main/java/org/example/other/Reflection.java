package org.example.other;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

  public static void main(String[] args) {
    MyClass myClass = null;
    try {
      Class clazz = Class.forName(MyClass.class.getName());
      myClass = (MyClass) clazz.newInstance();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    System.out.println(myClass);//output created object reflection.MyClass@60e53b93
  }

  public static void printData(Object myClass){
    try {
      Method method = myClass.getClass().getDeclaredMethod("printData");
      method.setAccessible(true);
      method.invoke(myClass);
    } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }

}

 class MyClass {
  private int number;
  private String name = "default";

  //    public MyClass(int number, String name) {
//        this.number = number;
//        this.name = name;
//    }
  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    this.number = number;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void printData(){
    System.out.println(number + name);
  }
}