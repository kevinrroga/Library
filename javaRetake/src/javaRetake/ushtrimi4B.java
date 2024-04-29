package javaRetake;

import java.util.ArrayList;

public class ushtrimi4B {
	public static int sizeDivisible(ArrayList<Integer> array) {
		int count=0;
		//for each loop kjo poshte qe kalon ne cdo element vete pa e inicializuar
		for (Integer i : array)//kjo bohet thjesht kur sdo me bo naj veprim mrena arrayt
		{//kur eshte ArrayList perdoret .size
			if (i % array.size()==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(6);
		arr.add(6);
		arr.add(6);
		arr.add(6);
		arr.add(6);
		arr.add(6);
		
		System.out.println(sizeDivisible(arr));
	}

}
