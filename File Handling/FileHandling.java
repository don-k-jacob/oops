import java.util.Scanner;
import java.io.*;

public class FileHandling{
    public static void main(String[] args) {
        try {
            File newFile = new File("new_file.txt");
            if (newFile.createNewFile()) {
                System.out.println(newFile.getName() + " created.");
                FileWriter fileWriter = new FileWriter(newFile);
                fileWriter.write("New File\n");
                fileWriter.write("This file is created as part of OOP Lab.\n");
                fileWriter.write("File Written Sucessfully");
                fileWriter.close();
            } else {
                System.out.println("!!! FILE ALREADY EXITS!!!");
            }
            Scanner fileReader = new Scanner(newFile);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}