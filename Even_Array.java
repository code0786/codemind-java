import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    if(arr[i]%2==0){
		        count++;
		    }
		}
		if(count == n){
		    System.out.format("True");
		}
		else{
		    System.out.format("False");
		}
	}
}
