package educanet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte cislo");

        String input = sc.nextLine();
        char[] field = input.toCharArray();
        int number = 0;
        boolean istrue = true;

        for(int x = 0; x < field.length; x++){
            char c = field[x];
            if(Character.isDigit(c)){
                number = number + Character.getNumericValue(c);
            } else {
                istrue = false;
            }
        }

        if(!istrue){
            System.out.println("Neni validni cislo");
        } else {
            System.out.println(number);
        }
    }
}
