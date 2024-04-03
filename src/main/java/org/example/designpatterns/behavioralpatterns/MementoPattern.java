package org.example.designpatterns.behavioralpatterns;

public class MementoPattern {

  public static void main(String[] args) {

	Editor editor = new Editor();
	editor.type("Hello");
	editor.type("World");
	EditorMemento memento = editor.save();
	editor.type("!");
	System.out.println(editor.getContent());
	editor.restore(memento);
	editor.getContent();

  }
}

class EditorMemento {
  protected String content;

  public EditorMemento(String content) {
	this.content = content;
  }

  public String getContent() {
	return content;
  }
}

class Editor {

  protected String content = "";

  public void type(String words) {
	this.content = this.content + " " + words;
  }

  public EditorMemento save() {
	return new EditorMemento(this.content);
  }

  public String getContent() {
	return this.content;
  }

  public void restore(EditorMemento memento) {
	this.content = memento.getContent();
  }
}
