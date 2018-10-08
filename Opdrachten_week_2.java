import java.util.Scanner;
public class Opdrachten_week_2 {
    public static void main(String[] args) {
        String Aap = "Aap";
        String Noot = "Noot";
        String Mies = "Mies";
        String sep = System.lineSeparator();




        System.out.println(Aap + sep + Noot + sep + Mies + sep + Aap + " " + Noot + " " + Mies);
        eerstejaars();
        addDecimal();
        sumAndProductOfFourAndTwelve();
        priceToVat();
        averageOfThree();
        euroToDollar();
        secondsToMinHours();
        rounding();
        decimalRounding();



    }
    public static void addDecimal(){
        int add = 0;

        for(int i = 0; i <= 10; i++){
            add = add + i;
        }
        System.out.println("The sum of the numbers 1 to 10 = " +add);

    }
    public static void sumAndProductOfFourAndTwelve(){
        int vier = 4;
        int twaalf = 12;
        int sum = vier + twaalf;
        int product = vier * twaalf;
        String sep = System.lineSeparator();
        System.out.println("De som van 4 en 12 = " + sum + sep + "het product van 4 en 12 = " + product);
    }

    public static void priceToVat(){
        System.out.println("Enter your price: ");
        Scanner scanner = new Scanner(System.in);
       double price = scanner.nextDouble();
        double VAT = 1.21;
        double finalPrice = price * VAT;
        System.out.println("The final price is: " + finalPrice);

    }
    public static void averageOfThree(){
        System.out.println("Enter your three numbers: ");
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();
        double average = (first + second + third) / 3.0;
        System.out.println("The average is: " + average);
    }
    public static void euroToDollar(){
        System.out.println("Enter your price in Euro: ");
        Scanner scanner = new Scanner(System.in);
        double euroAmount = scanner.nextDouble();
        double euroValue = 1.162149;
        double dollarAmount = euroAmount * euroValue;
        System.out.println("Your value in Dollar is: " + dollarAmount);
    }

    public static void secondsToMinHours(){
        System.out.println("Enter your amount of seconds: ");
        Scanner scanner = new Scanner(System.in);
        double seconds = scanner.nextDouble();
        double minutes = seconds / 60.0;
        double hours = seconds / 3600.0;
        System.out.println("The amount of minutes is: " + minutes + " and the amount of hours is: "+ hours);
    }
    public static void rounding(){
        System.out.println("Enter some decimals: 0. ");
        Scanner scanner = new Scanner(System.in);
        double decimals = scanner.nextDouble();
        while(decimals > 10){
            decimals = decimals / 10.0;
        }
        if(decimals >= 5){
            int answer = 1;
            System.out.println("After rounding the answer is: "+ answer);
        }
        else{
            int answer = 0;
            System.out.println("After the rounding the answer is "+ answer);
        }

    }
    public static void decimalRounding(){
        System.out.println("Enter a number with a decimal (for example 2.3): ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
       double decimal = (number * 10) % 10;
       if( decimal >= 5){
           double addage = (10 - decimal) / 10;
           double roundedNumber = number + addage;
           System.out.println("The rounded number is: "+ roundedNumber);
       }

       else{
           double subtraction = decimal / 10;
           double roundedNumber = number - subtraction;
           System.out.println("The rounded number is: "+ roundedNumber);
       }

    }

    public static void eerstejaars(){
        System.out.println("Wat is uw leeftijd?");

        Scanner leeftijdInput = new Scanner(System.in);
        int leeftijd = leeftijdInput.nextInt();
        int afstudeerLeeftijd = leeftijd + 4;
        System.out.println("U bent "+ afstudeerLeeftijd + " jaar oud bij het afstuderen.");


    }

}


