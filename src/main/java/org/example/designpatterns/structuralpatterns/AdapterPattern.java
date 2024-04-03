package org.example.designpatterns.structuralpatterns;

public class AdapterPattern {
  public static void main(String[] args) {
    // Создаем объект старого плеера
    OldMusicPlayer oldPlayer = new OldMusicPlayer();

    // Создаем адаптер, который адаптирует старый плеер к новому интерфейсу
    NewMusicPlayer adapter = new MusicPlayerAdapter(oldPlayer);

    // Вызываем метод play() через адаптер
    adapter.play();

  }
}
class OldMusicPlayer {
  public void playMusic() {
    System.out.println("Playing music from old music player.");
  }
}

// Новый интерфейс, к которому нужно адаптировать старый класс
interface NewMusicPlayer {
  void play();
}

// Адаптер, который адаптирует старый класс к новому интерфейсу
class MusicPlayerAdapter implements NewMusicPlayer {
  private OldMusicPlayer oldPlayer;

  public MusicPlayerAdapter(OldMusicPlayer oldPlayer) {
    this.oldPlayer = oldPlayer;
  }

  @Override
  public void play() {
    oldPlayer.playMusic();
  }
}
