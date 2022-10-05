import java.util.*;
class Love{
    public static int prime(int n){
        if(n==1){
            return 0;
        }
        else{
            int c = 0 ;
            for(int i = 2 ; i <= n/2 ; i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		double sum = 0 , c =  0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    if(prime(arr[i])==1){
		        sum+=arr[i];
		        c++;
		    }
		}
		System.out.format("%.2f",sum/c);
	}
}