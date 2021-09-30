package educanet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo");

        int number = sc.nextInt();
        int sum = 0;

        for(sum=0; number!=0; number=number/10) {
            sum = sum + number % 10;
        }

        System.out.println(sum);
    }
}
