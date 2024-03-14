package wk9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class StudentCourseGradesOrganizer {

    public static void main(String[] args) {
        try{
            phase1();
            phase2();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static Path path;
    static Scanner input = new Scanner(System.in);
    static void phase1() throws IOException {

        Path rootPath = Path.of("src", "wk9", "organizer");
        System.out.println("Enter a year");
        String year = input.nextLine();
        System.out.println("Enter a semester");
        String semester = input.nextLine();
        path = rootPath.resolve(year).resolve(semester);
        Files.createDirectories(path);
    }
    static void phase2()throws IOException{
        System.out.println("Enter the number of courses for the semester");
        int numberOfCourses = input.nextInt();
        input.nextLine();  // consume \n char

        for(int i = 0; i < numberOfCourses; i++){
            System.out.println("Enter course code course course#" + (i + 1) );
            String courseCode = input.nextLine();
            Files.createDirectory(path.resolve(courseCode));
        }

        String[] evaluations = {"assignment1", "mid-term"};

        for(File file : path.toFile().listFiles()){
            for(String evaluation : evaluations){
                String courseName = file.getName();
                System.out.printf("Enter the grade for %s of course %s%n", evaluation, courseName);
                String grade = input.nextLine();
                Files.writeString(path.resolve(courseName).resolve(evaluation + ".txt"), grade  );
            }
        }


    }
}
