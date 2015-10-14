package kata3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailReader {

    private final String filename;

    public MailReader(String filename) {
        this.filename = filename;
    }

       public ArrayList<String> getDominiosArray(){
        ArrayList<String> dominiosArray = new ArrayList<>();
        try{
            BufferedReader fileIn = new BufferedReader(new FileReader(filename));
            String mail;
            while((mail = fileIn.readLine()) != null){
                if(!mail.contains("@"))
                    continue;
                dominiosArray.add(mail.split("@")[1]);
            }
        } catch(Exception e){
            System.out.println("Fichero no existe " + e);
        }
        return dominiosArray;
    }

}
