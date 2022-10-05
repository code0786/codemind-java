import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[m];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < m ; i++){
		    brr[i] = sc.nextInt();
		}
		int count = 0 ,c=0;
		for(int i = 0 ; i < n ; i++){
		    c=0;
		    for(int j = 0 ; j < m ; j++){
		        if(arr[i]==brr[j] && arr[i]!=0 && brr[j]!=0){
		            c++;
		            brr[j]=0;
		        }
		    }
		    if(c!=0){
		        count++;
		    }
		}
		System.out.format("%d",count);
	}
}