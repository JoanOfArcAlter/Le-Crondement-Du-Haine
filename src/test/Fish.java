package test;

public class Fish extends Animal implements Pet {
	private String name;
	protected Fish() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("���");
	}
	public void walk() {
		System.out.println("û�Ȳ�����·");
	}
}