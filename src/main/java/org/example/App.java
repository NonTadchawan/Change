package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int price=0, amount=0, change = 0;
        int bank500 = 0, bank100 = 0, bank50 = 0, bank20 = 0, bank10 = 0, coin1 = 0;
        price = Integer.parseInt(args[0]);
        amount = Integer.parseInt(args[1]);
        System.out.println("Price : "+price);
        System.out.println("Amount : "+amount);

        if (amount > price) {
            change = amount - price;
            System.out.println("Change : " + change);
            while (amount > price) {
                if (change >= 500) {
                    bank500 = bank500 + 1;
                    change = change - 500;
                } else if (change >= 100 && change < 500) {
                    bank100 = bank100 + 1;
                    change = change - 100;
                } else if (change >= 50 && change < 100) {
                    bank50 = bank50 + 1;
                    change = change - 50;
                } else if (change >= 20 && change < 50) {
                    bank20 = bank20 + 1;
                    change = change - 20;
                } else if (change >= 10 && change < 20) {
                    bank10 = bank10 + 1;
                    change = change - 10;
                } else if (change >= 1 && change < 10) {
                    coin1 = coin1 + 1;
                    change = change - 1;
                } else if (change == 0) {
                    break;
                }
            }
            if (bank500 != 0) {
                System.out.println("500 * " + bank500);
            }
            if (bank100 != 0) {
                System.out.println("100 * " + bank100);
            }
            if (bank50 != 0) {
                System.out.println("50 * " + bank50);
            }
            if (bank20 != 0) {
                System.out.println("20 * " + bank20);
            }
            if (bank10 != 0) {
                System.out.println("10 * " + bank10);
            }
            if (coin1 != 0) {
                System.out.println("1 * " + coin1);
            }
        } else {
            System.out.println("---Not enough money---");
        }
    }
}
