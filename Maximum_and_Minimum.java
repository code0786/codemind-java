import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int min = 99999;
		int max = -10000;
		for(int i = 0 ; i < n ; i++){
		    int c = 1 ;
		    for(int j = 0 ; j < n ; j++){
		        if(i!=j && arr[j]!=0 && arr[i]!=0 && arr[i]==arr[j]){
		            c++;
		            arr[j] = 0;
		        }
		    }
		    if(arr[i]!=0 && arr[i]==c){
		        if(min>arr[i]){
		            min = arr[i];
		        }
		        if(max<arr[i]){
		            max = arr[i];
		        }
		    }
		    arr[i] = 0 ;
		}
		if(min!=99999 && max !=10000){
		    System.out.format("%d %d",min,max);
		}
		else{
		    System.out.format("-1");
		}
	}
}