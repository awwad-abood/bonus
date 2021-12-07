package bonus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) throws IOException {

//        int no = 0b111;
//        System.out.println(no);
        int num = 1;
        System.out.println("enter (b) to convert to binary or enter (d)to convert to dicimal");
        Scanner input2 = new Scanner(System.in);
        String inter = input2.nextLine();
        if (inter.contains("b")) {
            Scanner input = new Scanner(System.in);
                System.out.println("enter the num");
                num = input.nextInt();
            while (num > 0) {
                
                System.out.print(num % 2);
                num /= 2;
            }
        } else if (inter.contains("d")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the num");
            int dicimal = Integer.parseInt(reader.readLine(), 2);
            System.out.println(dicimal);
        } else {
            System.out.println("your input is error");
        }
        System.out.println("");
    }

}
