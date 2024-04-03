package org.example.designpatterns.structuralpatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightPattern {
  public static void main(String[] args) {
	  TeaMaker teaMaker = new TeaMaker();
	  TeaShop teaShop = new TeaShop(teaMaker);

	  teaShop.takeOrder("Black Tea", 1);
	  teaShop.takeOrder("Green Tea", 2);
	  teaShop.takeOrder("Black Tea", 3);

	  teaShop.serve();
  }
}
class KarakTea {
}

class TeaMaker {
  private List<KarakTea> teaList = new ArrayList<>();

  public KarakTea make(String name) {
	  if (teaList.isEmpty()) {
		  teaList.add(new KarakTea());
	  }
	  return new KarakTea();
  }
}

class TeaShop {
  private Map<Integer, KarakTea> orders = new HashMap<>();
  private TeaMaker teaMaker;

  public TeaShop(TeaMaker teaMaker) {
	  this.teaMaker = teaMaker;
  }

  public void takeOrder (String name, int table) {
	  orders.put(table, teaMaker.make(name));

  }

  public void serve() {
	  orders.forEach((key, value) -> System.out.println("Serving tea to table " + key));
  }
}

