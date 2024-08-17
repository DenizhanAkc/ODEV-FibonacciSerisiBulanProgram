import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanli fibonacci serisi olusturmak istersiniz? ");

        int eleman = input.nextInt();
        int numberOne = 0;
        int numberTwo = 1;

        System.out.print(numberOne + numberTwo);

        for(int i = 2; i <= eleman; i++) {

            int gecici = numberOne + numberTwo;
            System.out.print(" " + gecici);
            numberOne = numberTwo;
            numberTwo = gecici;
        }
        input.close();
    }

}