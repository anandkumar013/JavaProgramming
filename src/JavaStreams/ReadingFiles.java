package JavaStreams;

import java.io.*;

public class ReadingFiles {

    public static void main(String [] args) throws IOException {

        File f = new File(System.getProperty("user.dir")+ "/src/JavaStreams/myfiletxt.txt");
        FileReader fr = new FileReader(f);
        BufferedReader reader = new BufferedReader(fr);

//        System.out.println(reader.readLine());
//        System.out.println(reader.readLine());
        String line = null;
        while((line = reader.readLine())!= null){
            System.out.println(line);
        }


        reader.close();

    }
}

