package org.computermentors.NyjelDukes;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Game game = null; // Put your own answer in the parentheses
        try {
            File wordlistFolder = new File("wordlists");
            String[] wordLists = wordlistFolder.list();
            for(int i=0; i < wordLists.length; i++){
                System.out.printf("type %d for %s%n", i, wordLists[i]);
            }


            game = new Game(new WordList("wordlists/HardWords.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0 && !game.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }

        prompter.displayOutcome();
    }
}
