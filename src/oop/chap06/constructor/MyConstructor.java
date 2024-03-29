package oop.chap06.constructor;
//생성자 연습
public class MyConstructor {
	private String name;
	private String id;
	private String pass;
	private String nickname;
	private String addr;
	private int point;
	
	public MyConstructor(){
		System.out.println ("기본 생성자");
	} // 안쓰더라도 반드시 기본생성자는 생성해주자!! 
	
	//로그인용
	public MyConstructor(String name, String id, String pass) {
		System.out.println("매개변수 3개 생성자");
		//멤버변수(인스턴스변수, 객체변수)를 초기화
		this.name= name;
		this.id = id;
		this.pass = pass;
	} // 처음 가져와서 한꺼번에 셋팅
	  // 이미 만들어진 객체에 가서 하나씩 수정할 때 -> setter 메소드
	  // 

	//수정용
	public MyConstructor(String name, String id, String pass, String nickname) {
		this(name,id,pass); // 기존에 작성해 놓은 매개변수 3개의 생성자를 호출.
		System.out.println("매개변수 4개 생성자");
		this.nickname = nickname; 
	}
	
	//조회용
	public MyConstructor(String name, String id, String pass, String nickname, String addr) {
		this(name, id, pass, nickname);
		System.out.println("매개변수 5개 생성자");
		this.addr = addr;
	}
	
	// 삽입용
	public MyConstructor(String name, String id, String pass, String nickname, String addr, int point) {
		this(name, id, pass, nickname, addr);
		System.out.println("매개변수 6개 생성자");
		this.point = point;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	
}
