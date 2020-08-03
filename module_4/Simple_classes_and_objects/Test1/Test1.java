package by.jonline.simple_class.main;

/*
  Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
  Добавьте метод, который находит сумму значений этих переменных, и метод, который находит 
  наибольшее значение из этих двух переменных.  
*/

public class Test1 {

	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void printA() {
		System.out.println(this.a);
	}

	public void printB() {
		System.out.println(this.b);
	}

	public int getSum() {
		return a + b;
	}

	public int getMax() {

		return a > b ? a : b;
	}

}
