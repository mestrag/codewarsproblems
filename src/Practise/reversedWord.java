package Practise;

import java.util.ArrayList;

// Interview Questions
public class reversedWord {
    public static void main(String[] args) {
        String givenword = "our code";
        System.out.println(reversedWordProblem(givenword));
    }

    // take a word or phrase and reverse it
    public static String reversedWordProblem(String word) {
//reverse using RLO order using unicode U=202E
//       return "\u202E" + word;
//reverse using substring
        // return word.charAt(word.length()-1)+reversedWordProblem(word.substring(0,word.length()-2));
        String reversedword = "";
        for (int i = 0; i < word.length(); i++) {
            String subchar = word.substring(word.length() - 1 - i, word.length() - i);
            reversedword += subchar;
        }
        return reversedword;

    }
}
