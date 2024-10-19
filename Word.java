// Juan Padilla	
// Date: 10/17/2024


public class Word implements Comparable<Word> { // this creates a comparable class named "Word" that contains word object types
    private String word;// declares word string

    // Constructor
    public Word(String word) {
        this.word = word;
    }

    // Accessor
    public String getWord() {
        return word;
    }
    
    // compareTo Method
    public int compareTo(Word other) {
        return this.word.compareTo(other.word);
    }

    // toString Method
    public String toString() {
        return word;
    }
}

