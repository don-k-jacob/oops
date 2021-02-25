import java.util.Scanner;
import java.io.*;

public class ReadWriteFile {
    public static void main(String[] args) {
        try {
            File newFile = new File("file1.txt");
            if (newFile.createNewFile()) {
                System.out.println("New File : " + newFile.getName());
                FileWriter fileWriter = new FileWriter(newFile);
                fileWriter.write("New File\n");
                fileWriter.write("This file is created as part of OOP Lab.\n");
                fileWriter.write("File Successfully Written.\n");
                fileWriter.close();
            } else {
                System.out.println("File Already Exists!!!");
            }
            File inputFile = new File("file1.txt");
            File outputFile = new File("file2.txt");

            if (outputFile.createNewFile()) {
                System.out.println("New File to Copy : " + outputFile.getName());
            } else {
                System.out.println("!!! FILE ALREADY EXITS!!!");
            }
            FileReader inFile = new FileReader(inputFile);
            FileWriter outFile = new FileWriter(outputFile);

            int c;
            while ((c = inFile.read()) != -1) {
                outFile.write(c);
            }
            outFile.write("\nAbove Text Copied from "+ inputFile.getName());
            outFile.write("\nOperation Sucessful.");

            inFile.close();
            outFile.close();
        }

        catch (IOException e) {
            System.out.println(e);
        }

    }
}
