import java.io.*;
import java.util.Scanner;
public class Man {
    public static void main(String[] args) {
        File f ;
        FileWriter fw = null ;
        BufferedWriter fb = null ;
        Scanner input = new Scanner(System.in);
        try {
            f = new File("Test.txt");
            fw = new FileWriter(f);
            fb = new BufferedWriter(fw);
            int i = 1;
            while (i != 0) {
                System.out.print("Please input name : ");
                String s2 = input.nextLine();
                if (s2.equals("Q")) {
                    break;
                }
                fb.write("Name["+ i +"] : "+s2+"\n");
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                fb.close();
                fw.close();
                input.close();
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

