import java.util.*;
class Love{
    public static int prime(int n){
        if(n==1){
            return n-1;
        }
        else{
            int c = 0;
            for(int i = 2 ; i <= n/2 ; i++){
                if(n%i==0){
                    c++;
                }
            }
            if(c==0){
                return c+1;
            }
            else{
                return 0;
            }
        }
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(prime(n)==1){
		    int d = 0 , p = 0;
		    while(n>0){
		        if(prime(n%10)==1){
		            p++;
		        }
		        d++;
		        n/=10;
		    }
		    if(d==p){
		        System.out.format("Mega Prime");
		    }
		    else{
		        System.out.format("Not Mega Prime");
		    }
		}
		else{
		    System.out.format("Not Mega Prime");
		}
	}
}