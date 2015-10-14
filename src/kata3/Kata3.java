package kata3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata3\\Data\\emailsfilev1.txt";
        HistogramDisplay histo = new HistogramDisplay(histogram);
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(pathName));
            String mail;
            while ((mail=fileIn.readLine()) != null){
                if (!mail.contains("@")) continue;
                histogram.increment(mail.split("@")[1]);
            }
        } catch (Exception e) {
            System.out.println("Fichero no existe"+ e);
        }
        histo.execute();
    }
}
