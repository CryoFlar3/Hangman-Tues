package org.computermentors.NyjelDukes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordList extends ArrayList<String> {
    public WordList(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNext()){
            add(scanner.nextLine().toLowerCase());
        }
    }
    public String getRandom(){
        Random generator = new Random();
        return get( generator.nextInt( size() ) );
    }
}
