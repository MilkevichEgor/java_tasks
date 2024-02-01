package org.example.interview.streamapi;

import java.util.stream.Stream;

public class StreamApiOperation {

  public static void main(String[] args) {
	Stream<String> stream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
//	stream.forEach(System.out::println);

	Stream<String> stream2 = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
//	stream2.filter(s -> s.length() == 6).forEach(System.out::println);

	Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6S", 54000), new Phone("Lumia 950", 45000),
			new Phone("Samsung Galaxy S6", 40000));
//	phoneStream.filter(p -> p.getPrice() < 50000).forEach(p -> System.out.println(p.getName()));

	Stream<Phone> phoneStream2 = Stream.of(new Phone("iPhone 6S", 54000), new Phone("Lumia 950", 45000),
			new Phone("Samsung Galaxy S6", 40000));
//	phoneStream2.map(p -> p.getName())
//			.forEach(s -> System.out.println(s));
//	phoneStream2
//			.map(p-> "название: " + p.getName() + " цена: " + p.getPrice())
//			.forEach(s->System.out.println(s));

	phoneStream2
			.flatMap(p->Stream.of(
					String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
					String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
			))
			.forEach(s->System.out.println(s));
  }
  static class Phone{

	private String name;
	private int price;

	public Phone(String name, int price){
	  this.name=name;
	  this.price=price;
	}

	public String getName() {
	  return name;
	}

	public void setName(String name) {
	  this.name = name;
	}

	public int getPrice() {
	  return price;
	}

	public void setPrice(int price) {
	  this.price = price;
	}
  }
}
