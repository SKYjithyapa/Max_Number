import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();

        int Max = num1;
        int min = num1 ;

        while (true){

             num1 = input1.nextInt();


            if (num1< 0 ){
                break;
            }
            if (num1>Max){
                Max = num1;
            }

            if (num1<min){
                min = num1;
            }

        }

        System.out.println(Max);
        System.out.println(min);

    }
}