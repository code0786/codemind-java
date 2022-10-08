import java.util.*;
class Love{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int temp = n*n;
		while(temp>0){
		    sum+=temp%10;
		    temp/=10;
		}
		if(n==sum){
		    System.out.format("Neon Number");
		}
		else{
		    System.out.format("Not Neon Number");
		}
	}
}