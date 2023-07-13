package aBotsuliakG7_robots;

public class Robot {
    private String nameOf;
    private int healthPoints;
    private String button20;
    private String button20Used;


    public Robot(String externalNameOf) {
        nameOf = externalNameOf;
        healthPoints = 100;

        button20 = "";
        button20Used = "";
        RandomAlphabet random = new RandomAlphabet(); // zroby cykl
        button20 = button20 + random.getRandomKey();
        button20 = button20 + random.getRandomKey();
        button20 = button20 + random.getRandomKey();
        button20 = button20 + random.getRandomKey();
        button20 = button20 + random.getRandomKey();
    }

    public boolean getHit(String letter){
        Boolean heHit = button20.contains(letter);
        if (heHit) {
            button20 = button20.replace(letter, "");
            button20Used = button20Used + letter;
            healthPoints = healthPoints - 20;
            System.out.println("What a hit!");
        } else if (button20Used.contains(letter)){
            System.out.println("You've already used this hit");
            Menu.doTheHit();
        } else {
            System.out.println("Robot missed a hit!");
        }
        return true;
    }

    public String getNameOf() {
        return nameOf;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getButton20() {
        return button20;
    }

    public String getButton20Used() {
        return button20Used;
    }
}