import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int c = 0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i = 0 ; i < n ; i++){
		    if(arr[i]==k){
		        c++;
		    }
		}
		if(c==0){
		    System.out.format("False");
		}
		else{
		    System.out.format("True");
		}
	}
}