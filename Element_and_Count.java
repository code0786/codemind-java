import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
		    int c = 1 ;
		    if(arr[i]!=0){
		        System.out.format("%d ",arr[i]);
		    }
		    for(int j = 0 ; j < n ; j++){
		        if(i!=j && arr[j]!=0 && arr[i]!=0 && arr[i]==arr[j]){
		            c++;
		            arr[j] = 0;
		        }
		    }
		    if(arr[i]!=0){
		        System.out.format("%d ",c);
		    }
		    arr[i] = 0 ;
		}
	}
}