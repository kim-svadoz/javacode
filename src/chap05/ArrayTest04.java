package chap05;

import java.util.Random;

// �迭�� ����, ����, �ʱ�ȭ�� �Ѳ����� ó���ϱ�
public class ArrayTest04 {
	public static void main(String[] args) {
		// �ٸ� ���� ������ ������� �����ϱ� - ,�� �迭 ��Ҹ� �����Ѵ�.
		// int[] myarr = new int[5];
		int[] myarr = {10,20,30,40,50};
		System.out.println("�迭�� ����� ����:"+myarr.length);
		for(int i=0;i<myarr.length;i++) {
			System.out.println(myarr[i]);
		}
		
		//�ڹپ�� ��� ����, ����, �ʱ�ȭ 
		int[] myarr2 = new int[] {10,20,30,40,50};
		System.out.println("�迭�� ����� ����:"+myarr.length);
		for(int i=0;i<myarr2.length;i++) {
			System.out.println(myarr2[i]);
		}
		
		//������ �迭�� ����� ������ �ʱ�ȭ�� �Ѳ�����
		String[] strArr = {new String("java"),
							new String("servelet"),
							new String("spring")};
		System.out.println("������ ������ ����:"+strArr.length);
		//������ �迭�̱� ������ ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ�, String�� ����!!
		for(int i=0;i<strArr.length;i++) {
			System.out.println("�迭���=>"+strArr[i]);
		}
		
		Random[] randArr = {new Random(),new Random()};
		for(int i=0;i<randArr.length;i++) {
			System.out.println("�迭���=>"+randArr[i]);
		}
		
		//String Ŭ������ �⺻��ó�� ����� �� �ִ�. - ���� ���� ���̴� �������̹Ƿ� ���
		String[] strArr2 = {"java","servlet","spring","hadoop"};
		System.out.println("����:"+strArr2.length);
		for(int i=0;i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}
	}
}