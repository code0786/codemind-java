import java.util.Scanner;

 class DisariumNumber
{
    public static void main(String[] args)
    {
        int r, n, num,digits=0,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            digits++;
            num = num / 10;
        }
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + (int)Math.pow(r, digits);
            num = num / 10;
            digits--;
        }        
        
        if(n==sum)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}