package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rename {

    public static void rename(String path) throws FileNotFoundException {
        File fileToRename = new File(path);
        Scanner scanner = new Scanner(fileToRename);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            sb.append(text).append("\n");
        }
        String allText = sb.toString();

        String pattern = "\\(?(1 2 3 4 5)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(allText);
        if (m.find()) {
            File renamedFile = new File("LOGO_");
            boolean flag = fileToRename.renameTo(renamedFile);
            if (flag == true) {
                System.out.println("renamed successful");
            } else {
                System.out.println("unsuccessful");
            }
        }
        scanner.close();
    }

}
