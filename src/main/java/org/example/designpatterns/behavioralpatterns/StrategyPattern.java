package org.example.designpatterns.behavioralpatterns;

class StrategyPattern {

  public static void main(String[] args) {

	int[] array = new int[]{2, 2, 5, 5, 1, 1, 9, 9, 6, 4, 7, 3};

	Sorter sorter = new Sorter(new BubbleSort());
	Sorter sorter2 = new Sorter(new QuickSort());

	sorter.sort(array);
	sorter2.sort(array);

  }
}
interface Strategy {
  int[] sort(int[] array);
}
class BubbleSort implements Strategy {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Bubble sort");
		return array;
	}
}

class QuickSort implements Strategy {
	@Override
	public int[] sort(int[] array) {
		System.out.println("Quick sort");
		return array;
	}
}

class Sorter {
  private Strategy sortStrategy;

  public Sorter(Strategy sortStrategy) {
	this.sortStrategy = sortStrategy;
  }

  public int[] sort(int[] dataset) {
	return sortStrategy.sort(dataset);
  }
}




