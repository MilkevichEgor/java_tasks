package org.example.designpatterns.generativepatterns;

public class FabricMethod {

  public static void main(String[] args) {

	DevelopmentManager developmentManager = new DevelopmentManager();
	developmentManager.takeInterview();

	MarketingManager marketingManager = new MarketingManager();
	marketingManager.takeInterview();
  }
}

interface Interviewer {
  void askQuestions();
}

class Developer implements Interviewer {

  @Override
  public void askQuestions() {
	System.out.println("Asking about design patterns");
  }
}

class CommunityExecutive implements Interviewer {

  @Override
  public void askQuestions() {
	System.out.println("Asking about community management");
  }
}

abstract class HiringManager {

  protected abstract Interviewer makeInterviewer();

  public void takeInterview() {
	Interviewer interviewer = makeInterviewer();
	interviewer.askQuestions();
  }
}

class DevelopmentManager extends HiringManager {

  @Override
  protected Interviewer makeInterviewer() {
	return new Developer();
  }
}

class MarketingManager extends HiringManager {

  @Override
  protected Interviewer makeInterviewer() {
	return new CommunityExecutive();
  }
}