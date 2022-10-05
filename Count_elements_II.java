import java.util.*;
class Love{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x[] = new int[10];
        int y[] = new int[10];
        int a[] = new int[100];
        int b[] = new int[100];
        int count = 0 ;
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0;i<m;i++)
		{
		    x[i]=sc.nextInt();
		    a[x[i]]++;
		}
		for(int i=0;i<n;i++)
		{
        	y[i]=sc.nextInt();
	        b[y[i]]++;
	    }
	    for(int i=0;i<100;i++)
	    {
    	    if(a[i]>0 && b[i]==0 || a[i]==0 && b[i]>0)
	            count++;
		}
		System.out.print(count);
    }
}