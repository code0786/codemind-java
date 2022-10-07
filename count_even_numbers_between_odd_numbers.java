import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 1 ; i <= n-2 ; i++){
		    if(arr[i]%2==0 && arr[i-1]%2==1 && arr[i+1]%2==1){
		        count++;
		    }
		}
		System.out.format("%d",count);
	}
}