import java.io.File;
import java.util.Arrays;
import java.util.Collection;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class PBUpdate {
	
	public static void main(String[] args) {
		
		
		File folders = new File("sources"); //sources folder (contoh absolute path D:\\github\\PBUpdate\\sources)
		File foldert = new File("targets"); //targets folder (contoh absolute path D:\\github\\PBUpdate\\targets)
		File[] fileEntrys = folders.listFiles();
		File[] fileEntryt = foldert.listFiles();
		List lsts = new LinkedList();
		List lstt = new LinkedList();
		
		for(File file :fileEntrys)lsts.add(file.getName());
		for(File file :fileEntryt)lstt.add(file.getName());
	
		Collection<String> mySets = lsts;
		Collection<String> mySett = lstt;
		
		
		compareList(mySets,mySett);
		
//		File source = new File("D:\\sources\\move1.txt");
//		File dest = new File("D:\\targets\\move1.txt");
//				
//		try {
//			FileUtils.copyFile(source, dest);
//		} catch (IOException e) {
//		    e.printStackTrace();
//		}

	}
	public static void compareList(Collection<String> listOne,Collection<String> listTwo){
		Collection<String> similar = new HashSet<String>( listOne );
		Collection<String> different = new HashSet<String>();
		different.addAll( listOne );
		different.addAll( listTwo );
		
		similar.retainAll( listTwo );
		different.removeAll( similar );
		
		
		System.out.printf("sources :%s%nTargets:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);
		
	}

}
