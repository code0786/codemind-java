import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0 , c = 0;
		for(int i = 0 ; i < n; i++){
		    arr[i] = sc.nextInt();
		    sum+=arr[i];
		}
		for(int i = 0 ; i < n; i++){
		    if(sum/n==arr[i]){
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