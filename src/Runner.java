import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {

        Wordle newWordle = new Wordle();
        System.out.println(newWordle.getLetter());

        newWordle.startGame();


    }
}
