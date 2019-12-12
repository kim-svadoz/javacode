package oop.chap07;

public class Teacher extends Person{
	private String subject;
	public Teacher() {
		
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void print() {
		super.print(); //�θ�Ŭ������ PersonŬ������ print�޼ҵ带 ȣ��
		System.out.println("\t\t����:"+getSubject());
	}
	
	
}