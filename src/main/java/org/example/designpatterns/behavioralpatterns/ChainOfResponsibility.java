package org.example.designpatterns.behavioralpatterns;

public class ChainOfResponsibility {
  public static void main(String[] args) throws Exception {

	Bank bank = new Bank(1000);
	Paypal paypal = new Paypal(2000);
	Bitcoin bitcoin = new Bitcoin(3000);

	bank.setNext(paypal);
	paypal.setNext(bitcoin);

	bank.pay(2500);

  }
}

abstract class Account {
	protected Account successor;
	protected float balance;

	public void setNext (Account account) {
		this.successor = account;
	}

	public void pay(float amount) throws Exception {
	  if (canPay(amount)) {
		System.out.printf("Оплата %s, используя %s", amount, this.getClass().getSimpleName());
	  } else if (successor != null) {
		System.out.printf("Нельзя заплатить, используя %s. Обработка ..%n", this.getClass().getSimpleName());
		successor.pay(amount);
	  } else {
		throw new Exception("Недостаточно средств");
	  }
	}

	public boolean canPay(float amount) {
		return balance >= amount;
	}
}

class Bank extends Account {
  public Bank(float balance) {
	this.balance = balance;
  }
}

class Paypal extends Account {
  public Paypal(float balance) {
	this.balance = balance;
  }
}

class Bitcoin extends Account {
  public Bitcoin(float balance) {
	this.balance = balance;
  }
}
