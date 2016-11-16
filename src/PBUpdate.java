import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;

public class PBUpdate {
	
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName());
	        }
	    }
	}

	
	

	public static void main(String[] args) {
		final File folder = new File("D:\\sources");
		listFilesForFolder(folder);
		
//		File source = new File("D:\\sources\\move1.txt");
//		File dest = new File("D:\\targets\\move1.txt");
//				
//		try {
//			FileUtils.copyFile(source, dest);
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}

	}

}
