package sec1;

public class Bre {
	private String name;
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	Bre(String name) {
		this(name, "?а???");
	}
	Bre(String name, String matrial) {
		this(name, matrial, 90);
	}
	Bre(String name, String matrial, int gram) {
		this(name, matrial, gram, 900);
	}
	Bre(String name, String matrial, int gram, int price) {
		this(name, matrial, gram, price, 1);
	}
	Bre(String name, String matrial, int gram, int price, int cnt) {
		super();
		this.name = name;
		this.matrial = matrial;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}
	public int computeTotal() {
		return this.price*this.cnt;
	}
	public int computeTotal(int price) {
		return price*this.cnt;
	}
	public int computeTotal(int price, int cnt) {
		return price*cnt;
	}
	
}
