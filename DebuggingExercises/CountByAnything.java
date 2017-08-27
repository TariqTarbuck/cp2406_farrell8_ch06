import java.util.Scanner;
class CountByThrees{


    public static void main(String[] args){

        Scanner userNum = new Scanner(System.in);
        System.out.println("Enter a number ");
        int i = userNum.nextInt();


        for (;i <= 300; i++);
        {

            if (i % 3 == 0)
                System.out.print(i);
            if(i % 15== 1)System.out.println();



        }
    }

}




