import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bottles of beer do you have on the wall?");
        int response = scanner.nextInt();
        bottleCounter(response);

    }
    public static void bottleCounter(int startNum) {

        for(int i = startNum; i >= 0; i--){
            //First conditional, if i is not 1, print with the plural text
            if (i!=1) {
                System.out.print(i + " bottles of beer on the wall, " + i + " bottles of beer.\n");
                //If i is zero, print special "go to the store" string
                if (i == 0) {
                    System.out.print("Go to the store and buy some more, "+ startNum + " bottles of beer on the wall.\n\n");
                }
                //if i is 2, we know the next value will be one, and therefore will require singular grammar
                else if (i == 2) {
                    System.out.print("Take one down and pass it around, " + (i-1) + " bottle of beer on the wall.\n\n");
                }
                //If i is any other arbitrary number, print standard plural form
                System.out.print("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.\n\n");
            }
            else {
                //If i is 1, then you just need to print the singular text form and the next "0 bottles of beer on the wall"
                System.out.print("1 bottle of beer on the wall, 1 bottle of beer. \n");
                System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.\n");
            }
        }

    }
}