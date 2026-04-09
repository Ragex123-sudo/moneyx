import java.util.Scanner;
class App
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int number;
        int income;
        int spending=0;
        System.out.println("Enter your total income");
        income=sc.nextInt();
        System.out.println("Enter the number of expenditure");
        number=sc.nextInt();
        String [] description=new String[number];
        for(int i=0;i<description.length;i++)
        {

            if(i==0)
            {
                System.out.println("Enter the description");
                description[i]=sc.nextLine();
            }
            System.out.println("Enter the description");
            description[i]=sc.nextLine();
        }
        int cost[]=new int[number];
        for(int i=0;i<cost.length;i++)
        {
            System.out.println("Enter the expenditure for "+" "+description[i]);
            cost[i]=sc.nextInt();
        }
        for(int i=0;i<cost.length;i++)
        {
        System.out.println("expenditure on "+description[i]+cost[i]);
        spending=spending+cost[i];
    }
    if(spending==income)
    {
        System.out.println("Make sure to save some money from the next time");
    }
    else if(spending<income)
    {
        int savings =income-spending;
        System.out.println("Congratulations you saved "+savings );
    }
    else
    {
        System.out.println("oh no!you have spended more than you earned");
    }
}
}