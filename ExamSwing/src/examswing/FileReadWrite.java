package examswing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileReadWrite {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\JUTHI-PC\\Desktop\\New folder\\java.txt");
        if (file.exists()) {
            System.out.println("File Already Exist");
        } else {
            file.createNewFile();
        }

        //write
        PrintWriter write = new PrintWriter(file);
        write.print("Hello Java! How are you?");
        write.close();

        //File read
        FileReader read = new FileReader(file);
        Scanner input = new Scanner(file);
        System.out.println(input.nextLine());
        input.close();

    }

}
