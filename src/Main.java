import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variable defined.
        int total = 0;

        //Scanner created.
        Scanner inp = new Scanner(System.in);

        //Data retrieved from user.
        System.out.println("Enter number: ");
        int enteredNum = inp.nextInt();

        //It will work 0 to enteredNum.
        for (int i = 0; i <= enteredNum; i++) {
            //Each loop is checking divisible 3 or 4.
            if(i % 3 ==0 || i % 4 == 0){
                //If number divisible by 3 or 4 the number will be added to the total number.
                total = total + i;
            }
        }
        //Result is printed.
        System.out.println(total);
    }
}