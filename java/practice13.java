import java.io.FileWriter;
import java.io.IOException;

public class practice13{

    public static void main(String[] args) {
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();
//        MyInt i = () -> System.out.println("I am display");

        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
