import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordleList {
    private ArrayList<Word> words;

    private void importWordList(String fileName)
    {
        try
        {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            words = new ArrayList<Word>();

            while ((line = bufferedReader.readLine()) != null)
            {
                // import all cells for a single row as an array of Strings,
                // then convert to ints as needed
                String[] cerealFromCSV = line.split(",");

                // pull out the data for this cereal
                String name = cerealFromCSV[0];


                // create Cereal object to store values
                Word nextWord = new Word(name);

                // adding Cereal object to the arraylist
                words.add(nextWord);
            }
            bufferedReader.close();
        }
        catch(IOException exception)
        {
            // Print out the exception that occurred
            System.out.println("Unable to access " + exception.getMessage());
        }
    }
}
