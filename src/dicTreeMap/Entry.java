package dicTreeMap;

import java.util.ArrayList;

public class Entry {
    private String word;
    private ArrayList<String> meaning;

    public Entry(String word, ArrayList<String> meaning){
        this.meaning = new ArrayList<>();
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<String> getMeaning() {
        return meaning;
    }

    public void setMeaning(ArrayList<String> meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        String ls ="";
        for(String temp : meaning){
            ls += temp + "\n";
        }
        return word + ": " + ls + "\n";
    }
}
