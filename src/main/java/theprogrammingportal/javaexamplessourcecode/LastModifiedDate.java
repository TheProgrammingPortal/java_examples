package theprogrammingportal.javaexamplessourcecode;

import java.io.File;
import java.text.SimpleDateFormat;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.nio.file.attribute.BasicFileAttributes;

public class LastModifiedDate {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\roshan\\Desktop\\Temp.txt";

        // Method 1 - using java.io package
        File file = new File(filePath);
        System.out.println(file.lastModified());  // in milliseconds and not in readable format
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println(sd.format(file.lastModified())); // in proper date format

        // Method 2 - using java.nio package
        try {
            Path path = Paths.get(filePath);
            BasicFileAttributes attribute = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println(sd.format(attribute.lastModifiedTime().toMillis()));
            System.out.println(sd.format(attribute.lastAccessTime().toMillis()));
            System.out.println(sd.format(attribute.creationTime().toMillis()));

        } catch (Exception e) {
        }

    }
}
