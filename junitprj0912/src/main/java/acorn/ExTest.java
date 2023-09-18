package acorn;

import java.util.ArrayList;

public class ExTest {

	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiple(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public static ArrayList<Integer> yaksu(int a) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i<=a; i++) {
			if(a%i==0) {
				list.add(i);
			}
		} return list;
	}
	
	public static void main(String[] args) {
		ExTest test = new ExTest();
		int result1 = test.add(5, 3);
		int result2 = test.subtract(5, 3);
		int result3 = test.multiple(5, 3);
		int result4 = test.divide(12, 3);
		System.out.println("더하기 : "+result1);
		System.out.println("빼기 : "+result2);
		System.out.println("곱하기 : "+result3);
		System.out.println("나누기 : "+result4);
		
		int a = 12;
        ArrayList<Integer> list = yaksu(a);
        System.out.println(a + "의 약수 : ");
        for (int yaksu : list) {
            System.out.print(yaksu + " ");
        }
	}
}
