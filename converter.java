                                 //Converter using switch Case
  
import java.util.*;
public class converter {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        double x,y,result;
        int ch;
        System.out.println("1. Centimeter Converted into Meter ");
        System.out.println("2. Meter converted into Centimeter ");
        System.out.println("3. Meter converted into KiloMeter ");
        System.out.println("4. KiloMeter converted into Meter ");
        System.out.println("5. Second converted into Minutes  ");
        System.out.println("6. Seconds converted into Hours ");
        System.out.println("7. SEconds converted into Days ");
        System.out.println("8. Seconds converted into Year ");
        System.out.println("9. Minute converted into Seconds  ");
        System.out.println("10. Hours converted into Seconds ");
        System.out.println("11. Days converted into Seconds ");
        System.out.println("12. Year converted into Seconds ");
        System.out.println("13. MiliGram converted into Gram ");
        System.out.println("14. Gram converted into KiloGram ");  
        System.out.println("15. Gram converted into MiliGram "); 
        System.out.println("16. Kilogram converted into Gram "); 
        
        
        System.out.println("Enter the user choice : ");
        ch=sc.nextInt();
       
        switch(ch)
        {
         case 1:
         System.out.println("Enter the Value of Centimeter : ");
         x=sc.nextDouble();
         result=x/100;
         System.out.print(result + " Meter");
         break;

         case 2:
         System.out.println("Enter the Value of Meter : ");
         x=sc.nextDouble();
         result=x*100;
         System.out.print(result + " CentiMeter");
         break;

         case 3:
         System.out.println("Enter the Value of Meter : ");
         x=sc.nextDouble();
         result=x/1000;
         System.out.print(result + " KiloMeter");
         break;

         case 4:
         System.out.println("Enter the Value of Kilometer : ");
         x=sc.nextDouble();
         result=x*1000;
         System.out.print(result + " Meter");
         break;

         case 5:
         System.out.println("Enter the Value of seconds : ");
         x=sc.nextDouble();
         result=x/60;
         System.out.print(result + " Minutes");
         break;

         case 6:
         System.out.println("Enter the Value of seconds : ");
         x=sc.nextDouble();
         result=x/(60*60);
         System.out.print(result + " Hours ");
         break;

         case 7:
         System.out.println("Enter the Value of seconds : ");
         x=sc.nextDouble();
         result=x/(24*60*60);
         System.out.print(result + " Days");
         break;

         case 8:
         System.out.println("Enter the Value of seconds : ");
         x=sc.nextDouble();
         result=x/(365*24*60*60);
         System.out.print(result + " year");
         break;

         case 9:
         System.out.println("Enter the Value  of minutes: ");
         x=sc.nextDouble();
         result=x*60;
         System.out.print(result + " Seconds");
         break;

         case 10:
         System.out.println("Enter the Value of hours : ");
         x=sc.nextDouble();
         result=x*(60*60);
         System.out.print(result + " Seconds");
         break;

         case 11:
         System.out.println("Enter the Value of days : ");
         x=sc.nextDouble();
         result=x*(24*60*60);
         System.out.print(result + " Seconds");
         break;

         case 12:
         System.out.println("Enter the Value of year : ");
         x=sc.nextDouble();
         result=x*(365*24*60*60);
         System.out.print(result + " Seconds");
         break;

         case 13:
         System.out.println("Enter the Value of MiliGram : ");
         x=sc.nextDouble();
         result=x/1000;
         System.out.print(result + " Gram");
         break;

         case 14:
         System.out.println("Enter the Value Gram : ");
         x=sc.nextDouble();
         result=x/1000;
         System.out.print(result + " KiloGram");
         break;

         case 15:
         System.out.println("Enter the Value of Gram : ");
         x=sc.nextDouble();
         result=x*1000;
         System.out.print(result + " MiliGram");
         break;

         case 16:
         System.out.println("Enter the Value  of KiloGram : ");
         x=sc.nextDouble();
         result=x*1000;
         System.out.print(result + " Gram");
         break;

            default:
            System.out.println("Invalid Operation : ");
        } 
       
    }
} //end program       Md Danish
