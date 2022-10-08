import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		int l = 2,r = 2;
		while(l*2<=n){
            l*=2;
        }
        while(r<=n){
            r*=2;
        }
        if(n-l<r-n){
            System.out.format("%d",n-l);
        }
        else
        {
            System.out.format("%d",r-n);
        }
	}
}