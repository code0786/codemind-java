import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    System.out.format("%d ",arr[i]);
		}
		if(n%2==1){
		    System.out.format("0");
		}
	}
}