import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = scan.nextInt();
        int b = scan.nextInt();
        System.out.format("%d",t*b*s*512*2);
    }
}