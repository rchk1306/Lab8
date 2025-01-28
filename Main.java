import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Please input csv file name : ");
            String filename = input1.nextLine();
            System.err.print("Please input string : ");
            String name = input1.nextLine();
            File f ;
            FileReader fr ;
            BufferedReader fb ;
            try {
                f = new File(filename+".csv");
                fr = new FileReader(f);
                fb = new BufferedReader(fr);
                System.out.println("");
                String s;
                while ((s = fb.readLine()) != null) {
                    if (s.contains(name)) {
                        System.out.println(s); 
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            }
            input1.close();
        }
}
