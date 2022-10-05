import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int c = 0 , s = 0;
		for(int i = 0 ; i < n-1 ; i += 2){
		    if(arr[i]<arr[i+1]){
		        s++;
		    }
		    if(arr[i]>arr[i+1]){
		        c++;
		    }
		}
		if(s == n/2 || c == n/2){
		    System.out.format("yes");
		}
		else{
		    System.out.format("no");
		}
	}
}