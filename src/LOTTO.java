import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class LOTTO {
    public static <vinstlotto> void main(String[] arg) throws IOException {
        vinstlott[] v=new vinstlott[1000];
        int n=0;    // antal vinstlotter
        Scanner fil=new Scanner(new File("vinster.txt"));
        //ett varv per rad i filen
        while (fil.hasNext()) {
            v[n]=new vinstlott();
            v[n].nr=fil.nextInt();    // lotto numret
            v[n++].vinst=Integer.parseInt(fil.nextLine());
        }

        sortera(v, 0, n - 1);
        PrintWriter utstrom=new PrintWriter(new BufferedWriter(new FileWriter("dragningslista")));

        int i;
        for (i=0; i < n; i++) ;
        utstrom.println(v[i].nr + v[i].vinst);
        utstrom.close();
    }

    private static void sortera(vinstlott[] v, int i, int i1) {
    }

}
class vinstlott {
    public int nr;
    public int vinst;


    public static void sortera(vinstlott[] a, int start, int slut) {
        for (int k=start; k < slut; k++) {
            int m=k;
            for (int i=k; i < slut; i++)
                if (a[i].nr < a[m].nr)
                    m=i;
            Class vinslott;
            vinstlott temp=a[k];
            a[k]=a[m];
            a[m]= temp;
        }
    }
}



