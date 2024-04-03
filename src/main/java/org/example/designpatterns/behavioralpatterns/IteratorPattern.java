package org.example.designpatterns.behavioralpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPattern {
  public static void main(String[] args) {

	StationList stationList = new StationList();

	stationList.addStation(new RadioStation(89));
	stationList.addStation(new RadioStation(90));
	stationList.addStation(new RadioStation(101.3f));
	System.out.println(stationList.getCurrent(1));

//	stationList.forEach(s->System.out.println(s.getNext()));

	stationList.removeStation(new RadioStation(90));

//	stationList.forEach(s->System.out.println(s.getFrequency()));
  }
}

class RadioStation {
  protected float frequency;

  public RadioStation(float frequency) {
	this.frequency = frequency;
  }

  public float getFrequency() {
	return frequency;
  }

  public String toString() {
	  return "Frequency: " + frequency;
  }
}

class StationList implements Iterable<RadioStation> {

  List<RadioStation> stationList = new ArrayList<>();

  protected int count;

  public void addStation(RadioStation station) {
	  stationList.add(station);
  }

  public void removeStation(RadioStation station) {
	float toRemoveStation = station.getFrequency();
	 stationList.removeIf(s->s.getFrequency()==toRemoveStation);

  }

  @Override
  public Iterator<RadioStation> iterator() {
	return stationList.iterator();
  }

  public void next() {
	  this.count++;
  }

  public RadioStation getCurrent(int count) {
	  return stationList.get(count);
  }
}