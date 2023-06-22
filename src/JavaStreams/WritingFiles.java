package JavaStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {
    public static void main(String[] args) throws IOException {

        File f = new File( System.getProperty("user.dir")+"/src/JavaStreams/myfiletxtcsv.csv");
        FileWriter fw = new FileWriter(f);
        BufferedWriter writer = new BufferedWriter(fw);

        writer.write("Anand");
        writer.newLine();
        writer.write("test");
        writer.newLine();
        writer.write("t");
        writer.newLine();

        writer.close();
        System.out.println("file Is created");


    }
}
