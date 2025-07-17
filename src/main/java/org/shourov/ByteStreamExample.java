package org.shourov;

import java.io.*;

public class ByteStreamExample {
    public void rootDirectoryFileExample() {
        try (FileInputStream fis = new FileInputStream("paragraph.txt")) {
            int data;
            while((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void resourcesDirectoryFileExample() {
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("paragraph2.txt")) {
            if(is == null) {
                throw new FileNotFoundException("File not found in the resources folder.");
            }
            int data;
            while((data = is.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void absolutePathFileExample() {
        try (FileInputStream fis = new FileInputStream("/home/shourov/Desktop/paragraph3.txt")) {
            int data;
            while((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void rootDirectoryFileOutputExample() {
        String text = "This is paragraph 4..";
        try (FileOutputStream fos = new FileOutputStream("paragraph4.txt")) {
            fos.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
