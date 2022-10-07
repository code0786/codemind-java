import java.util.*;
class Love{
    public static int rev(int n){
        int r = 0;
        while(n>0){
            r = r*10 + (n%10);
            n/=10;
        }
        return r;
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = rev(n);
		int temp = 0,c = 0;
		while(n>0){
		    if(c==0 && n%10==6){
		        temp = temp*10 + 9;
		        c++;
		    }
		    else{
		        temp = temp*10 + n%10;
		    }
		    n/=10;
		}
		System.out.format("%d",temp);
	}
}