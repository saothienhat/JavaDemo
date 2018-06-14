package saothienhat.javacore.file;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * @author Sao Thien Hat
 *
 */
public class BaseFileManager {
  
  /**
   * @param newFolderPath such as "C:\\Directory1"
   */
  public void createFolder(String newFolderPath) {
    new File(newFolderPath).mkdir();
  }
  
  /**
   * @param path such as "C:\\Directory2\\Sub2\\Sub-Sub2"
   */
  public void createFolderAndItsSubFolders(String path) {
    new File(path).mkdirs();
  }
  
  /**
   * @param folder
   * @return true if folder existed. Otherwise return false
   */
  public boolean isExistedFolder(String folder) {
    File file = new File(folder);
    return file.exists();
  }
  
  
  public void createNewFile(String filePath) {
    final String METHOD_NAME = "createNewFile";
    try {
      File file = new File(filePath);
      if (file.createNewFile()) {
        System.out.println("File is created!");
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public void deleteFile(String filePath) {
    final String METHOD_NAME = "deleteFile";
    try {
      File file = new File(filePath);
      if (file.delete()) {
        System.out.println(file.getName() + " is deleted!");
      } else {
        System.out.println("Delete operation is failed.");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("IOException: " + e.getMessage());
    }
  }
  
  public void openFileOnDefaultApp(String filePath) {
    final String METHOD_NAME = "openFileOnDefaultApp";
    File htmlFile = new File(filePath);
    try {
      Desktop.getDesktop().browse(htmlFile.toURI());
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("IOException: " + e.getMessage());
    }
  }

}
