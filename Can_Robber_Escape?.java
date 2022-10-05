import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int os = 0;
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = scan.nextInt();
            if(a[i]%2!=0)
            {
                os++;
            }
        }
        if(os <= 2){
            System.out.format("YES");
        }
        else{
            System.out.format("NO");
        }
    }
}