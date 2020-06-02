package util;

import data.UnicodeLangEntity;
import java.util.Random;

public class WordsGenerator {
    private Random random;
    private static WordsGenerator instance;

    private WordsGenerator(){
        random = new Random(System.currentTimeMillis());
    }

    public static WordsGenerator getInstance() {
        if(instance == null){
            instance = new WordsGenerator();
        }
        return instance;
    }

    private char randomUnicodeChar(UnicodeLangEntity entity){
        return (char)(entity.getFirstLetter() + random.nextInt(entity.getLettersCount()));
    }

    public String getRandomWord(UnicodeLangEntity entity, int wordLength){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            stringBuilder.append(randomUnicodeChar(entity));
        }
        return stringBuilder.toString();
    }
}
