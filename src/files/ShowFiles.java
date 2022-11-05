package files;

import java.io.*;

public class ShowFiles {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Box\\src\\files\\Mytext"));
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("Usage : ShowFile filename");
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file");
            return;
        }
        try {
            do {
                i = br.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("error reading file");
        }
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Error closing file");
        }

    }
}
