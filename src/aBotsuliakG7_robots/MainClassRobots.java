package aBotsuliakG7_robots;

import java.util.Random;
import java.util.Stack;

public class MainClassRobots {
    public static void main(String[] args) {
        RandomAlphabet random = new RandomAlphabet();
        String robot1name = Menu.getRobotName("1");
        Robot robot_1 = new Robot(robot1name);
        String robot2name = Menu.getRobotName("2");
        Robot robot_2 = new Robot(robot2name);
//        list robots

//

        System.out.println("My name is " + robot_1.getNameOf() + " HP = " + robot_1.getHealthPoints() + " letters " + robot_1.getButton20());
        System.out.println("My name is " + robot_2.getNameOf() + " HP = " + robot_2.getHealthPoints() + " letters " + robot_2.getButton20());
//        start of cykj
        Robot currentRobot = robot_2;
        String enteredLetterAny = Menu.doTheHit();
        String enteredLetter = enteredLetterAny.toUpperCase();
            if ((random.alphabet).contains(enteredLetter)) {
                currentRobot.getHit(enteredLetter);
            } else if (robot_2.getHealthPoints() <= 0) {
                System.out.println(robot_1.getNameOf() + " WINS!!");
                System.out.println(robot_2.getNameOf() + " DIED");
            } else if (enteredLetter == "P") {
                final String EXIT = "P";
            } else {
                System.out.println("Wrong button. Please select one of the following buttons");
                Menu.doTheHit();
            }

//        System.out.println(robot_2.getButton20());
//        System.out.println(robot_2.getButton20Used());
//        System.out.println(robot_1.getButton20());
//        System.out.println(robot_1.getButton20Used());
//        boolean isGameEnded = false;
//        while (!isGameEnded)
//        do {
//
//            if (robot_1.getHealthPoints() <= 0 || robot_2.getHealthPoints() <= 0){
//                isGameEnded = true;
//                continue;
//            }
//        }

        System.out.println(robot_1.getNameOf() + " has " + robot_1.getHealthPoints() + " HP");
        System.out.println(robot_2.getNameOf() + " has " + robot_2.getHealthPoints() + " HP");
    }
}
