package kata3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        String pathName = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata3\\Data\\emailsfilev1.txt";
        MailReader dominios = new MailReader(pathName);
        ArrayList <String> domis = dominios.getDominiosArray();
        Histogram<String> histograma = DominiosHistogramBuilder.execute(domis);
    }
}
