package sec1;

public class Animal {
	private String name;
	private String type;
	private int legs;
	private int wings;
	private boolean spine;
	private int speed;
	Animal() {
		this("����");
	}
	Animal(String name) {
		this(name, "������");
	}
	Animal(String name, String type) {
		this(name, type, 4);
	}
	Animal(String name, String type, int legs) {
		this(name, type, legs, 0);
	}
	Animal(String name, String type, int legs, int wings) {
		this(name, type, legs, wings, true);
	}
	Animal(String name, String type, int legs, int wings, boolean spine) {
		this(name, type, legs, wings, spine, 100);
	}
	Animal(String name, String type, int legs, int wings, boolean spine, int speed) {
		super();
		this.name = name;
		this.type = type;
		this.legs = legs;
		this.wings = wings;
		this.spine = spine;
		this.speed = speed;
	}
	public void running() {
		System.out.println("������ �޸��ϴ�.");
	}
	public void running(String name) {
		System.out.println("������ �޸��ϴ�.");
	}
	public void running(String name, String type) {
		System.out.println("������ �޸��ϴ�.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
