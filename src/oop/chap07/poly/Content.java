package oop.chap07.poly;

public abstract class Content {
	private String title;
	private int price;
	
	public Content() {
		
	}
	public Content(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void totalPrice();
	
	public void show() {
		System.out.println(getTitle()+"비디오의 가격은"+getPrice()+"입니다.");
	}
}
