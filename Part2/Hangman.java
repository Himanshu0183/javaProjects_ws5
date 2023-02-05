import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Hangman {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String fileName = args[0];
            String word = args[1].toLowerCase();
            try {
                File file = new File(fileName);
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st;
                StringBuilder inLine = new StringBuilder();
                StringBuilder startsAndEndsWith = new StringBuilder();
                startsAndEndsWith.append("input: ").append(word).append("\n");
                int totalLines = 0;
                int totalWords = 0;
                int exactMatches = 0;
                int partialMatches = 0;
                while ((st = br.readLine()) != null) {
                    String[] words = st.toLowerCase().trim().split(" ");
                    totalLines++;
                    for (int i = 0; i < words.length; i++) {
                        totalWords++;
                        if (words[i].trim().equals(word)) {
                            exactMatches++;
                            inLine.append((totalLines)).append(" ");
                        } else {
                            if (words[i].contains(word)) {
                                partialMatches++;
                                if (words[i].trim().startsWith(word) || words[i].trim().endsWith(word)) {
                                    startsAndEndsWith.append("(line: " + (totalLines) + " Word: " + words[i] + "), ");
                                }
                            }
                        }
                    }
                }

                if (exactMatches == 0 && partialMatches == 0) {
                    System.out.println("Word " + word + "not found in the file " + fileName);
                }
                System.out.println("Line number of all the occurrence of word in the text file: ");
                System.out.println(inLine);
                System.out.println();
                System.out.println("Line number and complete word where input word is the starting or ending of another word");
                System.out.println(startsAndEndsWith);
                System.out.println();
                System.out.println("Total number of exact matches: " + exactMatches);
                System.out.println("Total count of partial matches: " + partialMatches);
                System.out.println("Total lines read from file: " + totalLines);
                System.out.println("Total words read from file: " + totalWords);
            } catch (IOException ex) {
                System.out.println("error: cannot find the file("+fileName+") specified");
            }
        } else {
            System.out.println("file name and word are required");
        }
    }
}
