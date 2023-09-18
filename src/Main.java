import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bottles of beer do you have on the wall?");
        int response = scanner.nextInt();
        bottleCounter(response);

    }
    public static void bottleCounter(int startNum) {
        for(int i =startNum; (i < startNum + 1) & (i >= 0); i--){
            if (i!=1) {
                System.out.print(i + " bottles of beer on the wall, " + i + " bottles of beer.\n Take one down and pass it around, ");

                if ((i-1)<=0) {
                    System.out.println("Go to the store and buy some more, "+ startNum + " bottles of beer on the wall");
                }else {
                    System.out.println(i-1 + " bottles of beer on the wall.");
                }
            }
            else {
                System.out.println(i + " bottle of beer on the wall");

            }
        }

    }
}