package javaRetake;

public class ushtrimi5B {

	public static void main(String[] args) {
		int[] array = TopIntegers(1,2,3,4,5,6,7,8,9);
		
		for (int i:array) {
			System.out.print(i + " ");
		}
	}
	//kthen nje array me integers prandaj e shkruajme int[]
	public static int[] TopIntegers(int ...a) {
		int[] arr = new int[3];
		int temp=0;
		for (int i=0; i<a.length-1; i++)
		{
			for (int j=i+1; j<a.length; j++) {
				if (a[j]>a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i=0; i<3; i++) {
			arr[i] = a[i];
		}
		return arr;
	}

}
