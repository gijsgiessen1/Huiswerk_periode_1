import java.util.Arrays;
import  java.util.Scanner;
public class Opdrachten_week_4 {
    public static void main(String[] args) {
        int[] intarray = new int[]{5, 3, 2, 6, 7, 8, 9, 2, 5, 5, 9, 9, 8, 8, 4, 4, 4,4,4,};
        returnString("Hello Daniel");
       biggestChallenge();
        challengingChallenge();
      faculteit();
       opdrachtDriePuntNul();
        getallenvuller();

        arrayTeller(intarray);

    }
    public static void getallenvuller(){
        int [] all_numbers = new int[500];
        for(int i = 0; i < 500; i++){
            all_numbers[i] = i;


        }
        int[] all_new_numbers = new int[500];
        for(int i = 1; i<= 500; i++){
            all_new_numbers[i - 1] = i;

        }
        int[] all_numbers_descending = new int[500];
        for(int i = 500; i > 0; i--){
            all_numbers_descending[500 - i] = i;

        }
    int som = 0;

        int i = 0;
        while(i < 500){
            int temp = som;
            som = temp + all_new_numbers[i];
           i++;

        }
        System.out.println("de som van alle getallen is: " + som);

   }

  public static void challengingChallenge() {

      char[] woord = new char[]{'c', 'a', 'b', 'a', 'r', 'e', 't', 'a', 'v', 'o', 'n', 'd'};
      char[] puntjes = new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.'};
      int length = puntjes.length;
      String[] hangman = new String[]{ " jgs_|___","|", "|      / \"","|       |", "|      ~~|/","|      (_)","|/      |", "________" };
      int a = 0;
      int fout = 0;
      Scanner letterInput = new Scanner(System.in);

      while (true) {
          System.out.println("Please enter one character, thanks! :-) ");
          char letter = letterInput.next().charAt(0);
          int aantalKeer = 0;
          for (int i = 0; i < 12; i++) {
              int getal = i + 1;
              int temp = aantalKeer;
              if (woord[i] == letter) {
                  aantalKeer = temp + 1;
                  System.out.println("Uw letter komt voor op de plek: " + getal);


              }

          }
          for(int i = 0; i < length; i++)
          if(letter == woord[i]){
            puntjes[i] = woord[i];

          }

          if(aantalKeer == 0){
              int temp = fout;
              fout = temp + 1;
          }

          StringBuilder loopWord = new StringBuilder("");

          System.out.println("het karakter " + letter + " komt dus " + aantalKeer + " keer voor!");

          for(int i = 0; i < length; i++){
              loopWord.append(puntjes[i]);
          }
          System.out.println(loopWord);
          System.out.println("U heeft " + fout + " fouten gemaakt!");
          for(int i= 1; i <= fout; i++){
              if(fout > 0){
              System.out.println(hangman[hangman.length - i]);
              if(hangman.length - i == 0){
                  System.out.println("U heeft verloren!");
                  return;
              }
              }
          }
          if(loopWord.toString().equalsIgnoreCase("cabaretavond")) {
              System.out.println("U heeft gewonnen!");
              break;
          }
            a++;



      }
  }

  public static void biggestChallenge(){

        int [][] tabel = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        int length = tabel.length;
        int i = 0;
        while(i < length){
            int metalength = tabel[i].length;
            int j = 0;
            while(j < metalength){
                System.out.print(tabel[i][j]);
                if(j == metalength -1){
                    System.out.println("");
                }
                j++;
            }
            i++;

        }
      System.out.println(System.lineSeparator());
        int a = 0;
        while(a < length){
            int metalength = tabel[a].length;
            int b = 0;
            while(b < metalength){
                System.out.print(tabel[b][a]);
                if(b == metalength -1){
                    System.out.println("");
                }
                b++;

            }
            a++;
        }

  }

  public static void opdrachtDriePuntNul(){
        Scanner beginInput = new Scanner(System.in);
        Scanner eindInput = new Scanner(System.in);
        Scanner stapInput = new Scanner(System.in);

      System.out.println("Vult u een beginwaarde in: ");

        int beginwaarde = beginInput.nextInt();

      System.out.println("Vult u een eindwaarde in");

        int eindwaarde = eindInput.nextInt();

      System.out.println("Vult u een stapgrootte in");

        int stapgrootte = stapInput.nextInt();

      System.out.println("X X^2 X^3 ");

        while(beginwaarde <= eindwaarde){



            System.out.println(beginwaarde + " " + Math.pow(beginwaarde, 2) + " " + Math.pow(beginwaarde, 3) );

            beginwaarde = beginwaarde + stapgrootte;

        }
  }

  public static void faculteit(){
      System.out.println("Vult u een eindwaarde in voor n: ");
      Scanner waardeInput = new Scanner(System.in);
      int eindwaarde = waardeInput.nextInt();
      int i = 0;
      int a = 1;
      int b = 1;
      int j = 0;



      while(i < eindwaarde){



          i++;

          a = a * i;

          b = b + 1;









          }



      }

      public static boolean arrayTeller(int[] array){
        int length = array.length;
          System.out.println("geef me een getal");
          int getal;
          Scanner getalInput = new Scanner(System.in);
          getal = getalInput.nextInt();
        int aantalGroter = 0;
        int i = 0;

        while( i < length){
            if(getal > array[i]){
                aantalGroter++;
            }
            i++;
        }
        if(aantalGroter > (length / 2)){
            System.out.println(true);
            return true;

        }

        else { System.out.println(false);
            return false;}

      }

      public static String returnString(String S){

          System.out.println(S);
          return S;

      }

  }













