import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int c = 0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    if(arr[i]%2==1){
		        c=i;
		    }
		}
		System.out.format("%d",c);
	}
}