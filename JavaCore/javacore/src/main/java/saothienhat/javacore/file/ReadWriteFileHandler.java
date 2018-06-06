package saothienhat.javacore.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Sao Thien Hat
 *
 */
public class ReadWriteFileHandler {
  
  public ReadWriteFileHandler() {
    
  }

  public void readFileByBufferedReader(String fileName) {
    BufferedReader br = null;
    FileReader fr = null;
    try {
        fr = new FileReader(fileName);
        br = new BufferedReader(fr);
        String currentLine = "";
        while ((currentLine = br.readLine()) != null) {
            System.out.println(currentLine);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
            if (br != null)
                br.close();
            if (fr != null)
                fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
  }

}
