package review;

import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		int[] v = {2,7,5,8,6,9};
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i=0; i<v.length; i++) {
			arr.add((Integer)v[i]);
			//edhe se shkruajme sepse int ke dhe arrayn dhe wrapper classin
			System.out.println(v[i]);
		}
	}
}
