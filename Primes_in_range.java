import java.util.*;
class Love{
    public static int prime(int n){
        if(n==1){
            return  0;
        }
        else{
            int c = 0 ;
            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
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
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count = 0 ;
		for(int i = m ; i <= n ; i++){
		    if(prime(i)==1){
		        count++;
		    }
		}
		System.out.format("%d",count);
	}
}