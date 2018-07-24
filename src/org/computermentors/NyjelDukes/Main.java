package org.computermentors.NyjelDukes;

public class Main {

    public static void main(String[] args) {
        Game game = new Game("static"); // Put your own answer in the parenthises
        Prompter prompter = new Prompter(game);

        while (game.getRemainingTries() > 0) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
    }
}
