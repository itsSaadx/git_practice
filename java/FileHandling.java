// import java.io.File;
// import java.io.IOException;  

//  class FileHandling {
//     public static void main(String[] args) {
//         File saad = new File("xyz.txt");
//         try {
//             saad.createNewFile();  
//         } catch (IOException e) {
//             e.printStackTrace();  
//         }
//     }
// }

//____________________________________write code to a file______________________________________________________

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class FileHandling {
//     public static void main(String[] args) {

//         File myFile = new File("CWH_file1.txt");
//         try {
//             FileWriter fileWriter = new FileWriter("CWH_file1.txt");
//             fileWriter.write("CodeWithHarry is one step solution for your all programming problems.\nKeep learning, Keep coding!");
//             fileWriter.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//     }
// }



//_________________________________________READING FILE____________________________________

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


//________________________________delete a file___________________________________


// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;

// public class FileHandling {
//     public static void main(String[] args) {

//         File myFile = new File("CWH_file1.txt");
//         if(myFile.delete()){
//             System.out.println("I have deleted: " + myFile.getName());
//         }
//         else{
//             System.out.println("Some problem occurred while deleting the file");
//         }

//     }

// }