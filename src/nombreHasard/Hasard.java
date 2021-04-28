package nombreHasard;

public class Hasard {
	public static void main(String[] args) {
		Random dimension = new Random();
		dimension.initArray(5);
		dimension.calcAverage();
		dimension.calcSum();
		dimension.display();
		String result = dimension.toString();
		System.out.println(result);
		dimension.displaySupNumberAverage();
	}
}

class Random {
	int[] array;
	int average;
	int sum;
	
	public void setArray() {
		this.array = new int[10];
	}
	
	public void initArray(int dim) {
		this.array = new int[dim];
		
		for (int i = 0; i < array.length; i++ ) {
			int random = (int) (Math.random() * 1000);
			array[i] = random;
		}
	}
	
	public int calcAverage() {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return  this.average = sum / array.length;
	}
	
	public int calcSum() {
		this.sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	
	public void display() {
		for (int a:array ) {
			System.out.println(a + " ");
		}
	}
	
	public void displaySupNumberAverage() {
		int average = calcAverage();
		for (int a:array) {
			if (a > average) {
				System.out.println(a);
			}
		}
	}

	public String toString() {
		return "Moyenne du tableau = " + average + "\nSomme du tableau = " + sum;
	}
}
