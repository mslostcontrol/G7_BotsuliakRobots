package aBotsuliakG7_robots;

import java.util.Scanner;

public class Menu {
    public static String getTextFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        }catch (Exception e){
            return null;
        }
    }
    public static String getRobotName(String robotNumber){
        System.out.println("What is the name of " + robotNumber + " robot?");
        return getTextFromConsole();
    }

    public static String doTheHit(){
        System.out.println("Your step. Press key: QWEASDZXC");
        return getTextFromConsole();
    }
}
