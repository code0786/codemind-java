import java.util.Scanner;
class solution
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double one = scan.nextDouble();
        double two = scan.nextDouble();
        double avg = (one+two)/2;
        System.out.format("%.4f",avg);
    }
}