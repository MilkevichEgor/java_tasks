package org.example.designpatterns.behavioralpatterns;

import java.util.Date;

public class MediatorPattern {

  public static void main(String[] args) {

	ChatRoomMediator chatRoom = new ChatRoom();
	User user1 = new User("John", chatRoom);
	User user2 = new User("Jane", chatRoom);
	user1.sendMessage("Hi, John!");
	user2.sendMessage("Hi, Jane!");
  }
}

interface ChatRoomMediator {

  void showMessage(String message, User user);
}

class ChatRoom implements ChatRoomMediator {

  @Override
  public void showMessage(String message, User user) {
	Date date = new Date();
	String sender = user.getName();
	System.out.println("[" + date + "] " + sender + " : " + message);
  }
}

class User {
  protected String name;
  protected ChatRoomMediator mediator;

  public User(String name, ChatRoomMediator mediator) {
	this.name = name;
	this.mediator = mediator;
  }

  public String getName() {
	return name;
  }

  public void sendMessage(String message) {
	mediator.showMessage(message, this);
  }
}