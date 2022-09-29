import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);

        double gasGallons= 0;
        double fuelEfficiency=0;
        double gasPrice=0;
        String trash="";

        System.out.print("Enter the number of gallons of gas in you tank: ");
        if(in.hasNextDouble())
        {
            gasGallons=in.nextDouble();
            in.nextLine();
            System.out.println("You said the gallons of gas in your tank is: " + gasGallons);

        }
        else
        {
            trash=in.nextLine();
            System.out.println(trash + " is an invalid response.");
            System.exit(0);
        }


        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if(in.hasNextDouble())
        {
            fuelEfficiency=in.nextDouble();
            in.nextLine();
            System.out.println("You said the fuel efficiency in miles per gallon : " + fuelEfficiency);

        }
        else
        {
            trash=in.nextLine();
            System.out.println(trash + " is an invalid response.");
            System.exit(0);
        }

        System.out.print("Enter the price of gas per gallon: ");
        if(in.hasNextDouble())
        {
            gasPrice=in.nextDouble();
            in.nextLine();
            System.out.println("You said the fuel efficiency in miles per gallon : " + gasPrice);

        }
        else
        {
            trash=in.nextLine();
            System.out.println(trash + " is an invalid response.");
            System.exit(0);
        }

        System.out.println("The cost per 100 miles is: " + gasPrice/fuelEfficiency *100);

        System.out.println("You can travel " + gasGallons*fuelEfficiency + " miles with " + gasGallons + " gallons of gas in your tank.");





    }
}