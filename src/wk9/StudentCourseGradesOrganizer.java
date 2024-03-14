package wk9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StudentCourseGradesOrganizer {

    public static void main(String[] args) {
        try{
            phase1();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static void phase1() throws IOException {
        Scanner input = new Scanner(System.in);
        Path rootPath = Path.of("src", "wk9", "organizer");
        System.out.println("Enter a year");
        String year = input.nextLine();
        System.out.println("Enter a semester");
        String semester = input.nextLine();

        Files.createDirectories(rootPath.resolve(year).resolve(semester));
    }
}
