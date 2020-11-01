import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class soklott {
    private static Object Public;

    public static int main(String[] arg) throws IOException {
        vinstlott[] v=new vinstlott[1000];
        int n=0;
        Scanner fil=new Scanner(new File("dragningslista.txt."));
        while (fil.hasNext()) {
            v[n]=new vinstlott();
            v[n].nr=fil.nextInt();
            v[n++].vinst=fil.nextInt();
        }
        while (true) {
            String t=JOptionPane.showInputDialog("lottonummer?");
            if (t == null)
                break;
            int söktnr=Integer.parseInt(t);
            int k=binsök(v, 0, n - 1, söktnr);
            if (k >= 0)
                JOptionPane.showMessageDialog(null, "Vinst:" + v[k].vinst);
            else
                JOptionPane.showMessageDialog(null, "nitlott");
        }
        public static int binsök (vinstlott[] a, int start, int slut, int sökt){
            int i1=start, i2=slut, m=0;
            while (i1 <= i2) {
                m=(i1 + i2) / 2;
                if (sökt < a[m].nr)
                    i2=m - 1;
                else if (sökt > a[m].nr)
                    i1=m - 1;
                else
                    break;
            }
            if (sökt == a[m].nr)
                return m;
            else
                return start - 1;
        }
    }
    private static int binsök(Object vinstlotts, int i, int i1, int söktnr) {
        return 0;
    }
}

