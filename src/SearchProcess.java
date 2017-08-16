import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchProcess {

  private String fileName;
  private List<String> result = new ArrayList<String>();

  public String getFileName() {
	return fileName;
  }

  public void setFileName(String fileName) {
	this.fileName = fileName;
  }

  public List<String> getResult() {
	return result;
  }

  
  public void searchFolder(File directory, String fileNameToSearch) {

	setFileName(fileNameToSearch);

	if (directory.isDirectory()) {
	    search(directory);
	} else {
	    System.out.println(directory.getAbsoluteFile() + " is not a directory!");
	}

  }

public void search(File file) {

	if (file.isDirectory()) {
	  

            
	    if (file.canRead()) {
		for (File temp : file.listFiles()) {
		    if (temp.isDirectory()) {
			search(temp);
		    } else {
			if (getFileName().equals(temp.getName().toLowerCase()) )//|| getFileName().contentEquals(temp.getName.to)) {
			    result.add(temp.getAbsoluteFile().toString());
		    }
			
		}
	    }

	 } 
      }

  }


