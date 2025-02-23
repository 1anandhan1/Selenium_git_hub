package basicprogram;

public class Secondlargest {

	public static void main(String[] args) {
		int [] arr = {23,76,87,10};
		int larg =Integer.MIN_VALUE;
		int secondlarg = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>larg) {
				secondlarg =larg;
				larg = arr[i];
			}else if (arr[i]>secondlarg && arr[i]!=larg) {
				secondlarg = arr[i];
			}
		}
  System.out.print("second largest num" +":"+secondlarg);
	}

}
