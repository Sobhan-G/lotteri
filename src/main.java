import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class main {
    static class card {

        public static void createFile() {
            Random r=new Random();
            card c=new card();
            try (PrintWriter printWriter=new PrintWriter(new File("Vinster.txt"))) {

                for (int i=0; i < 1000; i++) {
                    int card=r.nextInt(1000);

                    int Card=0;
                    printWriter.print(Card);
                    printWriter.print(' ');
                }
                printWriter.flush();

            } catch (IOException e) {
                System.out.println("error");
            }
        }
    }
}
