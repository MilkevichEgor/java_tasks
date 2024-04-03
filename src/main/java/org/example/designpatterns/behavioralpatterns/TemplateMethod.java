package org.example.designpatterns.behavioralpatterns;

public class TemplateMethod {

  public static void main(String[] args) {

	AndroidBuilder androidBuilder = new AndroidBuilder();
	androidBuilder.build();

	System.out.println("=======================");
	IOSBuilder iosBuilder = new IOSBuilder();
	iosBuilder.build();
  }
}

abstract class Builder {

  public void build() {
	test();
	lint();
	assemble();
	deploy();
  }

  abstract public void test();
  abstract public void lint();
  abstract public void assemble();
  abstract public void deploy();

}

class AndroidBuilder extends Builder {

  @Override
  public void test() {
	System.out.println("Test Android application");
  }

  @Override
  public void lint() {
	System.out.println("Lint Android application");
  }

  @Override
  public void assemble() {
	System.out.println("Assemble Android application");
  }

  @Override
  public void deploy() {
	System.out.println("Deploy Android application");
  }
}

class IOSBuilder extends Builder {
  @Override
  public void test() {
	System.out.println("Test IOS application");
  }

  @Override
  public void lint() {
	System.out.println("Lint IOS application");
  }

  @Override
  public void assemble() {
	System.out.println("Assemble IOS application");
  }

  @Override
  public void deploy() {
	System.out.println("Deploy IOS application");
  }
}
