import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wordle newWordle = new Wordle();
        System.out.println(newWordle.getLetter());
        System.out.println("Guess");
        String guess = scanner.nextLine();

        String[][] wordle = {{"h"},{"i"},{"e"},{"l"},{"g"}};
        wordle[0][0] = "hi";
        for(int i = 0; i < wordle.length; i++)
        {
            for(int j = 0; j < wordle[0].length; j++)
            {
                System.out.println(wordle[i][j]);
            }
        }


    }
}
