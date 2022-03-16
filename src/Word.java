public class Word {
    public String word;

    public Word(String word)
    {
        this.word = word;
    }


    public String getWord()
    {
        return word;
    }

    public String toString()
    {
        String str = "Word: " + word;
        return str;
    }
}
