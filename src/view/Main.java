package view;

import common.StaticScanner;
import controler.UserTwoControler;
import model.entity.UserTwo;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String []args) {
        UserTwoControler userTwoControler = new UserTwoControler();
        Scanner input = StaticScanner.getData();


        for (; ; ) {
            menu();
            int requestFromUser = input.nextInt();
            input.nextLine();
            switch (requestFromUser) {
                case 1 -> {
                    UserTwo userTwo = new UserTwo();
                    System.out.print ("id ra vared konid: ");
                    userTwo.setId(input.nextLong());
                    input.nextLine();

                    System.out.print ("text ra vared konid: ");
                    userTwo.setText(input.nextLine());

                    userTwoControler.save(userTwo);
                }

                case 2 -> {
                    List<UserTwo> userTwoList;
                    System.out.print ("id ra vared konid ta pm ha namayesh dade shavad: ");
                    userTwoList = userTwoControler.findByAll(input.nextLong());

                    userTwoList.forEach(System.out::println);
                }

                case 3 -> {
                    return;
                }
                default -> System.out.println("wrong number !!! ");
            }
        }
    }

    private static void menu() {
        System.out.println("1.ersal payam");
        System.out.println("2.daryaft payam");
        System.out.println("3.exit");
    }

}
