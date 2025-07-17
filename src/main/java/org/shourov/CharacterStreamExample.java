package org.shourov;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void fileReaderExample() {
        try (FileReader fr = new FileReader("paragraph.txt")) {
            int data;
            while((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileWriterExample() {
        String content = "This is another paragraph";
        try (FileWriter fw = new FileWriter("another-paragraph.txt")) {
            fw.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
