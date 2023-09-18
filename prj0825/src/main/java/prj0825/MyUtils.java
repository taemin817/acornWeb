package prj0825;


import java.util.ArrayList;

public class MyUtils {

	public String getdisisor(int su) {
		
		// 약수를 구하는 방법
		int su_half = su / 2;

		System.out.println(su);
		System.out.println(su_half);
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= su_half; i++) {
			if (su % i == 0) {
				nums.add(i);
			}
		}
		nums.add(su);
		String divisors = nums.toString();
		
		return divisors;
	}
}
