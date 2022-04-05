import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents the game wordle
 *
 * @Author Derrick Chen
 */
public class Wordle {
    /** ArrayList of string letter */
    private ArrayList<String> letter;
    /** 2D ArrayList of string wordle */
    private String[][] wordle;
    /** length of word */
    private int length;
    /** String of hidden word */
    private String word;
    /** Number of guess*/
    private int numGuess;
    /** ArrayList of string letter */
    private boolean win;
    /** boolean of if won */
    private boolean lost;
    /** boolean of if lost */
    private String guess;
    /** String of guess entered */

    /**
     * Intantiates a wordle object and
     * initalizes letter Array of letters of word generated
     * initalizes Wordlist to new wordleList newWordle
     * initalizes word to word from wordleList
     * initalizes length to length of word
     * initalizes wordle to 2D arrayList of all null
     * initalizes numGuess int to 0
     * initalizes win boolean to false
     * initalizes lost boolean to false
     * initalizes guess int to 0;
     */
    public Wordle()
    {

        letter = new ArrayList<>();
        WordleList newWordle = new WordleList();
        word = newWordle.getWord();
        length = word.length();
        wordle = new String[5][5];
        numGuess = 0;
        win = false;
        lost = false;
        guess = null;
    }

    /**
     * Returns list of the letters from randomly generated word
     *
     * @return the letters
     */
    public ArrayList<String> getLetter()
    {
        for(int i = 0; i < length; i++)
        {
            letter.add(word.substring(i,i + 1));
        }
        return letter;
    }

    /**
     * Starts the game
     * while the game hasn't been won
     * keep calling the checkWordle method
     * then the makeWordle method for display
     * and the makeGuess method for checking win or lose conditions
     */
    public void startGame()
    {
        while(win == false)
        {
            if(numGuess < 6) {
                checkingWordle();
                makeWordle();
                makingGuess();
            }
        }
    }

    /**
     * Goes through the list of wordle and
     * displays the 2D arraylist of nulls
     */
    public void makeWordle()
    {
        for(int i = 0; i < wordle[0].length; i++)
        {
            for(int j = 0; j < wordle.length; j++)
            {
                System.out.print(wordle[j][i] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Calls the method youLost to check for lost condition
     * sets up scanner for player input
     * guess is equal to player's input
     * ask player to make a guess
     * inserts guess within 2D arrayList wordle
     */
    public void makingGuess()
    {
        youLost();
        Scanner scanner = new Scanner(System.in);
        guess = scanner.nextLine();
        System.out.println("Make a Guess");

        for(int i = 0; i < wordle[0].length; i++)
        {
            wordle[i][numGuess] = guess.substring(i , i + 1);
        }
        numGuess++;
    }

    /**
     * if the guess is not null
     * check if guess equals secret word
     * if true, set win to true
     * and print "congrats"
     */
    public void checkingWordle()
    {
        if(!(guess == null))
        {
            if (guess.equals(word)) {
                win = true;
                System.out.println("CONGRATS!");
            }
        }
    }

    /**
     * if numGuess is 5 or not win
     * set lost to true and
     * print "try again next time"
     */
    public void youLost()
    {
        if(numGuess == 5 && !win)
        {
            lost = true;
            System.out.println("Try again next time");
        }
    }


}
