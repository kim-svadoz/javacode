package oop.chap07.poly;
/*
객체의 타입을 검사하고 작업할 수 있다.
'instanceof' 연산자를이용
*/

class AA{
	
}
interface IA{
	
}
public class InstanceOfTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//obj가 SuperA타입이라면 if블럭을 실행하라.
		//     => SuperA의하위냐?
		if(obj instanceof SuperA) {
			System.out.println("SuperA타입이다.");
		}else {
			System.out.println("SuperA타입이 아니다.");
		}
		System.out.println("==================================");
		if(obj instanceof InterA) {
			System.out.println("InterA타입이다.");
		}else {
			System.out.println("InterA타입이 아니다.");
		}
		System.out.println("==================================");
		if(obj instanceof InterB) {
			System.out.println("InterB타입이다.");
		}else {
			System.out.println("InterB타입이 아니다.");
		}
		System.out.println("==================================");
		if(obj instanceof InterC) {
			System.out.println("InterC타입이다.");
		}else {
			System.out.println("InterC타입이 아니다.");
		}
		System.out.println("==================================");
		if(obj instanceof IA) {
			System.out.println("IA타입이다.");
		}else {
			System.out.println("IA타입이 아니다.");
		}
	}
}
