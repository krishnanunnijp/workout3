import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class vowelsWordsLines {
    private BufferedReader reader = null;
    private int vowels = 0;
    private int words = 0;
    private int lines = 0;

    public vowelsWordsLines() {
        counted();
    }

    private void counted() {
        try
        {
            reader = new BufferedReader(new FileReader("C:\\Users\\Krishnanunni\\Documents\\workout3\\src\\test.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null)
            {
                lines++;
                String[] word = currentLine.split(" ");
                this.words = this.words + word.length;

                for (int i=0 ; i<currentLine.length(); i++)
                {
                    char ch = currentLine.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                    {
                        vowels++;
                    }
                }

                currentLine = reader.readLine();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                reader.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public int getLines() {
        return lines;
    }

    public int getVowels() {
        return vowels;
    }

    public int getWords() {
        return words;
    }
}
