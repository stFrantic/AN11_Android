package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class IOUtils {
    public static String[] getLines(String path){
        String[] lines = new String[2];
        int linesNotNull = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = reader.readLine();
            while (line != null) {
                if (linesNotNull == lines.length) {
                    lines = Arrays.copyOf(lines, lines.length * 2);
                }
                lines[linesNotNull] = line;
                linesNotNull++;
                line = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return Arrays.copyOf(lines, linesNotNull);
    }

    public static void writeLine(final String path, final String[] lines) {
        try (PrintWriter writer = new PrintWriter(path)) {
            for (final String line : lines) {
                writer.println(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static String[] splitOnWords(String line){
        return line.trim().split("\\W+");
    }
}

