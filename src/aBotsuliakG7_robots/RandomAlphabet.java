package aBotsuliakG7_robots;

import java.util.Random;

public class RandomAlphabet{
        String alphabet = "QWEASDZXC";

        char getRandomKey() {
            int randIdx = new Random().nextInt(alphabet.length());
            char randChar = alphabet.charAt(randIdx);
            alphabet = alphabet.replace(String.valueOf(randChar), "");
            return randChar;
        }
        public String Random5letters(){
            return "text";
        }
}
