package io.laptrinh.Liverpool.ChiDauKhuat.bai9;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {


        User user = new User();
        Dice dice = new Dice();
        int computerPoint = 0, c, i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The game has started !!!");

        do {
            if (user.point > 21) break;
            i++;
            System.out.println("Round " + i);
            user.point += dice.getValue();
            computerPoint += dice.getValue();
            System.out.println("Your point: " + user.point);

            System.out.println("Do u want to continue ?Press 1 to continue or 0 to end");
            System.out.println("---------");
            c = scanner.nextInt();
        } while (c == 1);
        System.out.println("Point of computer:" + computerPoint);
        if (user.point > 21) System.out.println("You lost");
        else {
            if (user.point > computerPoint) System.out.println("You won");
            if (user.point < computerPoint) System.out.println("You lost");
            if (user.point == computerPoint) System.out.println("Draw");
        }
    }
}
