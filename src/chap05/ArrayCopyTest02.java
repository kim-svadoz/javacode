package chap05;

public class ArrayCopyTest02 {
	public static void main(String[] args) {
		int[] firstArr = new int[5];
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = 10 + i;
		}
		
		// firstArr를 볼사할 배열을 선언
		int[] secondArr = new int[firstArr.length*2];
		// firstArr배열의 0번부터 firstArr의 모든 요소를 secondArr의 0번 위치부터 copy해서 저장하기
		System.arraycopy(firstArr, 3, secondArr, 2, 2);
		for(int i=0;i<secondArr.length;i++) {
			System.out.print(secondArr[i]+" ");
		}
		System.out.println();
	}
}
