package org.example.designpatterns.structuralpatterns;

public class BridgePattern {
  public static void main(String[] args) {

	DarkTheme darkTheme = new DarkTheme();
	LightTheme lightTheme = new LightTheme();

	About about = new About(darkTheme);
	Careers careers = new Careers(lightTheme);
	about.getContent();
	careers.getContent();
  }
}

interface WebPage {
  void getContent();
}

interface Theme {
  String getColor();
}

class About implements WebPage {
  protected Theme theme;

  public About(Theme theme) {
	this.theme = theme;
  }

  @Override
  public void getContent() {
	System.out.println("Page About: " + theme.getColor());
  }
}

class Careers implements WebPage {
  protected Theme theme;

  public Careers(Theme theme) {
	this.theme = theme;
  }

  @Override
  public void getContent() {
	System.out.println("Page Careers: " + theme.getColor());
  }
}

class ThemeImpl implements Theme {

  private String color;

  ThemeImpl(String color) {
	this.color = color;
  }

  @Override
  public String getColor() {
	return color;
  }
}

class DarkTheme implements Theme {
  @Override
  public String getColor() {
	return "Dark Theme";
  }
}

class LightTheme implements Theme {
  @Override
  public String getColor() {
	return "Light Theme";
  }
}

class AquaTheme implements Theme {
  @Override
  public String getColor() {
	return "Aqua Theme";
  }
}