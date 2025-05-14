package src.main.java;

public class Counter {
	private int count;

	public Counter() {
		this.count = 0;
	}
	
	public Counter(int initial) {
		this.count = initial;
	}

	public int getCount() {
		return count;
	}

	public void increment() {
		count++;
	}

	public void decrement() {
		count--;
	}
}
