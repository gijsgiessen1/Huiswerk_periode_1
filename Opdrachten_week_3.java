import java.util.Scanner;
public class Opdrachten_week_3 {
    public static void main(String[] args) {



        kledingruimte();
        verjaardag();
//        verjaardagSwitch();
        verjaardagMetSchrikkeljaar();
        salarisverhoging();
        voornaamPrint();
        jarigeJob();
        jippie();
        kip();
        letterMultiplier();
        pyramid();
        reversePyramid();
        megaChallenge();

    }

    public static void kledingruimte() {
        System.out.println("Please fill in your age:");
        Scanner scanner = new Scanner(System.in);
        Scanner sexInput = new Scanner(System.in);
        int age;

        do {
            try {
                String s = scanner.nextLine();
                age = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);

        if (age >= 12) {
            System.out.println("You don't need a guardian to help you in the changing room. ");
        } else {
            System.out.println("You are obliged to take a guardian with you to the changing room.");
        }
        System.out.println("Please fill in your sex: (Male, female) ");
        String sex = sexInput.nextLine();
        if (sex.equalsIgnoreCase("male") || sex.equalsIgnoreCase("Man") || sex.equalsIgnoreCase("Mannelijk")) {
            System.out.println("You may use the changing room for men.");
        } else if (sex.equalsIgnoreCase("female") || sex.equalsIgnoreCase("vrouw") || sex.equalsIgnoreCase("vrouwelijk")) {
            System.out.println("You may use the changing room for women.");
        } else {
            System.out.println("Sorry I did not understand your input.");
        }

    }

    public static void verjaardag() {
        System.out.println("Wat is de dag van uw verjaardag? ");
        Scanner dag = new Scanner(System.in);

        int dayOfBirth;

        do {
            try {
                String s = dag.nextLine();
                dayOfBirth = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);


        System.out.println("Wat is de maand van uw verjaardag? (input is een getal) ");
        Scanner maand = new Scanner(System.in);
        int monthOfBirth;

        do {
            try {
                String s = maand.nextLine();
                monthOfBirth = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);

        int i = 1;
        int numberOfDays = 0;


        if (dayOfBirth > 31 || dayOfBirth < 0 || monthOfBirth > 12 || monthOfBirth < 1) {

            System.out.println("You entered an invalid date");
        } else if (monthOfBirth == 1) {
            numberOfDays = dayOfBirth;
            System.out.println("Your birthday is on the " + numberOfDays + " day of the year!");
            return;
        }
        // else if(monthOfBirth == 8){
        //     numberOfDays = numberOfDays + 1;

        //  }

        while (i <= monthOfBirth) {


            if (monthOfBirth == i) {
                numberOfDays = numberOfDays - 2;
                numberOfDays = numberOfDays + dayOfBirth;

                System.out.println("Your birthday is on the " + numberOfDays + " day of the year!");
                return;
            } else if (i % 2 == 0) {
                numberOfDays = numberOfDays + 30;
            } else {
                numberOfDays = numberOfDays + 31;
            }


            i++;


        }

    }
//
//    public static void verjaardagSwitch() {
//        System.out.println("Wat is de dag van uw verjaardag? ");
//        Scanner dag = new Scanner(System.in);
//
//        int dayOfBirth;
//
//        do
//        {
//            try {
//                String s = dag.nextLine();
//                dayOfBirth = Integer.parseInt(s);
//                break;
//            }
//            catch (Exception e)
//            {
//                System.out.println("Couldn't parse input, please try again");
//            }
//        }
//        while (true);
//
//        System.out.println("Wat is de maand van uw verjaardag? (input is een getal) ");
//
//
//
//
//
//        int monthOfBirth;
//        Scanner maand = new Scanner(System.in);
//
//
//        do
//        {
//            try {
//                String s = maand.nextLine();
//                monthOfBirth = Integer.parseInt(s);
//                break;
//            }
//            catch (Exception e)
//            {
//                System.out.println("Couldn't parse input, please try again");
//            }
//        }
//        while (true);
//
//        int i = 1;
//        int numberOfDays = 0;
//
//        switch (monthOfBirth) {
//            case 1:
//                numberOfDays = dayOfBirth;
//                System.out.println("Your birthday is on the " + numberOfDays + " day of the year!");
//                break;  }
//
//
//
//
//        // else if(monthOfBirth == 8){
//        //     numberOfDays = numberOfDays + 1;
//
//        //  }
//
//        while(i <= monthOfBirth) {
//
//
//            switch (monthOfBirth) {
//                case i:
//                    numberOfDays = numberOfDays - 2;
//                    numberOfDays = numberOfDays + dayOfBirth;
//
//                    System.out.println("Your birthday is on the " + numberOfDays + " day of the year!");
//                    break;
//            }
//
//
//            switch (i % 2) {
//                case 0:
//                    numberOfDays = numberOfDays + 30;
//                    break;
//                default:
//                    numberOfDays = numberOfDays + 31;
//                    break;
//            }
//
//
//            i++;
//
//
//        }
//
//
//
//        }

    public static void verjaardagMetSchrikkeljaar() {
        System.out.println("Wat is de dag van uw verjaardag? ");
        Scanner dag = new Scanner(System.in);

        int dayOfBirth;

        do {
            try {
                String s = dag.nextLine();
                dayOfBirth = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);


        System.out.println("Wat is de maand van uw verjaardag? (input is een getal) ");
        Scanner maand = new Scanner(System.in);
        int monthOfBirth;

        do {
            try {
                String s = maand.nextLine();
                monthOfBirth = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);

        System.out.println("Wat is het jaar van uw geboorte? ");


        int yearOfBirth;
        Scanner jaar = new Scanner(System.in);

        do {
            try {
                String s = jaar.nextLine();
                yearOfBirth = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);

        int i = 1;
        int numberOfDays = 0;


        if (dayOfBirth > 31 || dayOfBirth < 0 || monthOfBirth > 12 || monthOfBirth < 1) {

            System.out.println("You entered an invalid date");
        } else if (monthOfBirth == 1) {
            numberOfDays = dayOfBirth;
            System.out.println("Your birthday is on the " + numberOfDays + " day of the year!");
            return;
        }
        // else if(monthOfBirth == 8){
        //     numberOfDays = numberOfDays + 1;

        //  }

        if (yearOfBirth % 4 == 0 && yearOfBirth % 100 != 0 || yearOfBirth % 400 == 0) {
            numberOfDays = numberOfDays + 1;
        }

        while (i <= monthOfBirth) {


            if (monthOfBirth == i) {
                numberOfDays = numberOfDays - 2;
                numberOfDays = numberOfDays + dayOfBirth;

                System.out.println("Your birthday is on the " + numberOfDays + " day of the year!");
                return;
            } else if (i % 2 == 0) {
                numberOfDays = numberOfDays + 30;
            } else {
                numberOfDays = numberOfDays + 31;
            }


            i++;


        }

    }

    public static void salarisverhoging() {
        System.out.println("Vult u alstublieft uw salaris in: ");
        Scanner salarisInput = new Scanner(System.in);
        double salaris;

        do {
            try {
                String s = salarisInput.nextLine();
                salaris = Double.parseDouble(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);

        if (salaris >= 1500) {
            salaris = salaris * 1.05;
        } else {
            salaris = salaris + 75;
        }
        System.out.println("Na de opslag is uw salaris: " + salaris);

    }


    public static void voornaamPrint() {
        System.out.println("Vult u alsturblieft uw voornaam in: ");
        Scanner voornaamInput = new Scanner(System.in);
        String voornaam = voornaamInput.nextLine();
        int i = 0;
        while (i < 5) {
            System.out.println(voornaam);
            i++;
        }
        for (int a = 5; a < 10; a++) {
            System.out.println(voornaam);
        }
    }

    public static void kip() {
        while (true) {
            System.out.println("Vul maar een woord in! :D ");
            Scanner woord = new Scanner(System.in);
            String kip = woord.nextLine();

            if (kip.equalsIgnoreCase("kip")) {
                System.out.println("Zonder kop!");
                break;
            }

        }


    }

    public static void jarigeJob() {
        System.out.println("Vul uw leeftijd in, jarige job!");
        Scanner leeftijdInput = new Scanner(System.in);
        int leeftijd;

        do {
            try {
                String s = leeftijdInput.nextLine();
                leeftijd = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("Couldn't parse input, please try again");
            }
        }
        while (true);


        for (int i = 0; i < leeftijd; i++) {
            System.out.println("hoera!");

        }
    }


    public static void jippie() {
        while (true) {
            System.out.println("vul een getal in: ");
            Scanner numberOne = new Scanner(System.in);
            int number1;


            do {
                try {
                    String s = numberOne.nextLine();
                    number1 = Integer.parseInt(s);
                    break;
                } catch (Exception e) {
                    System.out.println("Couldn't parse input, please try again");
                }
            }
            while (true);

            System.out.println("vul nog een getal in: ");
            Scanner numberTwo = new Scanner(System.in);
            int number2;


            do {
                try {
                    String s = numberTwo.nextLine();
                    number2 = Integer.parseInt(s);
                    break;
                } catch (Exception e) {
                    System.out.println("Couldn't parse input, please try again");
                }
            }
            while (true);

            if (number1 == number2) {
                System.out.println("Jippie!");
                break;
            }

        }

    }
        public static void letterMultiplier() {
            Scanner stringInput = new Scanner(System.in);

            while (true) {
                System.out.println("  Vul hier letters in: ");
                String letters = stringInput.nextLine();
                int i = 0;
                int length = letters.length();

                while(i < length){

                    char letter = letters.charAt(i);

                    String singeLetter = String.valueOf(letter);


                    for(int a = 0; a < 5; a++){
                        System.out.print(singeLetter);

                    }
                    i++;
                }
                if(letters.charAt(length -1) == 'z' || letters.charAt(length - 1) == 'Z'){
                    System.out.println("    ");
                    System.out.println("Klaar!");
                    break;
                }


            }


        }

        public static void pyramid(){
        Scanner numberInput = new Scanner(System.in);
        int i = 0;


        System.out.println("Please enter a whole number: ");
        int number = numberInput.nextInt();
            String stars = "*";

        while(i < number){
            i++;
            System.out.println(stars);

        stars = stars + "*";



        }

        }

        public static void reversePyramid() {
            Scanner numberInput = new Scanner(System.in);
            int i = 0;
            int a = 0;


            System.out.println("Please enter a whole number: ");
            int number = numberInput.nextInt();
            String stars = "*";




            while (i < number) {
                String empty = "";
                a = 0;


                while(a < number - i){

                    empty = empty + " ";
                    a++;



                }

                System.out.println(empty + stars);
                stars = stars + "*";
                i++;







            }


        }
        public static void megaChallenge(){
        Scanner numberInput = new Scanner(System.in);
            System.out.println("Please enter a whole number: ");
            int number = numberInput.nextInt();
            double i = 0;
            double a = 0;
            String symbol;
            while(i < number){
               String empty = "";
                a = 0;

                while(a < number - i){
                    empty = empty + " ";
                    a++;
                }

               int y = 0;
                if(i % 2 != 0) {
                    symbol = "";
                    while (y <= i) {
                        symbol = symbol + "*";
                        y++;
                    }
                }
                else{ symbol = "";
                    while(y <= i){
                        symbol = symbol + "+";
                        y++;

                    }

                }

                System.out.println(empty + symbol);
                i++;
            }

            i = number;

            while(i >= 0){

                String empty = "";
                a = number - i;

                while( a > 0 ){
                    empty = empty + " ";
                    a--;
                }

                int y = 0;
                if(i % 2 != 0) {
                    symbol = "";
                    while (y < i) {
                        symbol = symbol + "*";
                        y++;
                    }
                }
                else{ symbol = "";
                    while(y < i){
                        symbol = symbol + "+";
                        y++;

                    }

                }

                System.out.println(empty + symbol);
                i--;
            }
        }
}