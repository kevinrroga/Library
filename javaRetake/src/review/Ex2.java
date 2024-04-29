package review;
import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		int[] v = {2,7,5,8,9};
		ArrayList<Double> arr= new ArrayList<>();
		
		for (int i=0; i<v.length; i++) {
			arr.add((double)v[i]);
			//nga primitive int qe i kishe i bere primitive double
			System.out.println((double)v[i]);
		}
		
	}

}
