package org.shourov;

import java.io.*;

public class BufferedStreamExample {
    public static void readExample() {
        try (BufferedReader br = new BufferedReader(new FileReader("paragraph.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeExample() {
        String textBlock = """
                This
                is yet
                another
                paragraph""";

        try (BufferedWriter bw  = new BufferedWriter(new FileWriter("yet-another-paragraph.txt"))) {
            bw.write(textBlock);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
