package wk9;

import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Week9 {

    static void example1(){
        Path path = Path.of("src");
        System.out.println(path.toAbsolutePath());
    }
    static void example2(){
        //list all the files and folders of a directory
        Path path = Path.of("src/wk9");
        Path path1 = Path.of("src", "wk9");

        for(String file : path.toFile().list()){
            System.out.println(file);
        }


    }
    static void example3(){
        //list all the files and folders of a directory
        Path path = Path.of("src/wk9");
        Path path1 = Path.of("src", "wk9");

        for(File file : path.toFile().listFiles()){
            System.out.println(file.getName());
            System.out.println(file.length()); // size in bytes
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            System.out.println("*".repeat(20));
        }


    }
    static int getNumberOfFiles(Path path){
        int total = 0;

        for(File file : path.toFile().listFiles()){
            total++;
            if(file.isDirectory()){
                total += getNumberOfFiles(path.resolve(file.getName()));
            }
        }
        return total;
    }
    static void example4(){
        //get total number of files for wk9 folder

        Path path = Path.of("src", "wk9");
        int total = getNumberOfFiles(path);

        System.out.println(path.toString() + " has " + total + " total files and directories");

    }
    static void example5() throws IOException {

        Path path = Path.of("src","wk9","testdir3");
        Files.createDirectory(path);

    }
    static void example6() throws IOException{
        Path path = Path.of("src","wk9","testdir4", "testdir5", "testdir6");
        Files.createDirectories(path);

    }
    static void example7() throws IOException{
        Path path = Path.of("src","wk9","testdir7",
                "testdir8", "testdir9");
        Files.createDirectory(path); // will cause error

    }
    static void example8() throws IOException{
        Path path1 = Path.of("src","wk9","testdir3");
        Path path2 = Path.of("src","wk9","testdir33");
        Path path3 = Path.of("src","wk9","testdir3move3");
        Files.copy(path1, path2); // duplicate
        Files.move(path1, path3); // move


    }
    static void example9() throws IOException{
        Path path = Path.of("src","wk9","testdir33");
        path.toFile().delete();//
        Files.delete(path);

    }
    static void example10() throws IOException{
        Path path = Path.of("src","wk9","testdir33");
        path = path.resolve("myfile.txt");
        //path = path.getParent(); //gets parent directory
        //path.getParent().getParent(); //goes back two parent dir levels
        if(!Files.exists(path))
            path.toFile().createNewFile();

    }
    static void example11() throws IOException{
    Path path = Path.of("src","wk9","testdir33");
    path = path.resolve("data.txt");
    String content = "Hello there!\n";
//    Files.writeString(path, content);
Files.writeString(path, content, StandardOpenOption.APPEND);

    }
    static void example12() throws IOException{
        Path path = Path.of("src","wk9","testdir33");
        path = path.resolve("data.txt");
        String content = Files.readString(path);
        List<String> allLines =Files.readAllLines(path);
    }
    static void example13(){}
    static void example14(){}
    static void example15(){}
    public static void main(String[] args) {
        try {
            example11();
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
