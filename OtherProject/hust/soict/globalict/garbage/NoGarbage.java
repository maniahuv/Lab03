package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filename = "D:\\Java\\Lab03\\OtherProject\\hust\\soict\\globalict\\garbage\\test.exe"; 
        byte[] inputBytes;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));  
            long startTime = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (byte b : inputBytes) {
                sb.append((char) b);  
            }
            String outputString = sb.toString();  
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            e.printStackTrace();  
        }
    }
}
