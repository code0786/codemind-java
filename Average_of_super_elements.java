import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		double count = 0;
		double sum = 0 ;
		for(int i = 0 ; i < n ; i++){
		    int c = 1 ;
		    for(int j = 0 ; j < n ; j++){
		        if(i!=j && arr[j]!=0 && arr[i]!=0 && arr[i]==arr[j]){
		            c++;
		            arr[j] = 0;
		        }
		    }
		    if(arr[i]!=0 && arr[i]==c){
		        sum+=arr[i];
		        count++;
		    }
		    arr[i] = 0 ;
		}
		if(sum==0 && count ==0){
		    System.out.format("-1");
		}
		else{
		    System.out.format("%.2f",sum/count);
		}
	}
}