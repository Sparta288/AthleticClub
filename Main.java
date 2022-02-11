package cscmodule5project.learnprogramming;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<String>();
        ArrayList<String> second = new ArrayList<String>();
        ArrayList<String> third = new ArrayList<String>();
        ArrayList<String> fourth = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("----Welcome to Tom's Athletic Club----");

    try {

        for (int i = 0; i < 25; i++) {
            System.out.println("\nEnter the trainers first name : ");
            System.out.println("Enter number of new members : ");
            String name = sc.next();
            int clientNum = sc.nextInt();

            if (clientNum >= 0 && clientNum <= 5) {
                first.add(name);
            } else if (clientNum <=12) {
                second.add(name);
            } else if (clientNum <=20) {
                third.add(name);
            } else {
                fourth.add(name);
            }
        }




        System.out.println("\nMembers who enrolled 0 - 5 new members.");
        for (int i = 0; i < first.size(); i++) {
            System.out.println(first.get(i));
        }


        System.out.println("Members who enrolled 6 - 12 new members\n");
        for (int i = 0; i < second.size(); i++) {
            System.out.println(second.get(i));
        }
        System.out.println("Members who enrolled 13 - 20 new members\n");
        for (int i = 0; i < third.size(); i++) {
            System.out.println(third.get(i));
        }

        System.out.println("Members who enrolled above 20 new members");
        for (int i = 0; i < fourth.size(); i++) {
            System.out.println(fourth.get(i));
        }

    } catch(InputMismatchException e){
        System.out.println("Try again! Wrong input");
    }


    }
}
