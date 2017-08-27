import java.util.Scanner;

class evenEntryLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an interger");
        int userInput = input.nextInt();

        while (userInput != 999 && userInput < 999){
            System.out.println("Keep trying");
            userInput = input.nextInt();
        }
        System.out.println("You got it ");





    }
}