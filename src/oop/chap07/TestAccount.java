package oop.chap07;

import java.util.Scanner;

public class TestAccount {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		CheckingAccount acc1 = 
			new CheckingAccount("111-222-333",1000000, "�嵿��"
					,"1234-5647-8888"); // account, ownerName ,balance , cardNo
		
		System.out.println("ī���ȣ�Է�:");
		String cardNo = key.next();
		
		acc1.pay(500000, "1234-5678-8888");
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		acc1.pay(500000, cardNo);
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		
		/*acc1.pay(500000, "1234-5678-8888");
		System.out.println("�����ܾ�====>"+acc1.getBalance());
		acc1.pay(500000, "1234-5647-8888");
		System.out.println("�����ܾ�====>"+acc1.getBalance());*/
		
	}

}
