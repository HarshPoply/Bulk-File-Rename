import java.io.File;
import javax.swing.JFileChooser;

public class Prefix0 
{
	//args[0] will contain the default JFileChooser Path
   public static void main(String[] args) 
   {
	   
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File(args[0]+"\\"));
		
		chooser.setMultiSelectionEnabled(true);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.showOpenDialog(null);
		 
		 
		File[] oldNames = chooser.getSelectedFiles();

		for(int i=0; i<oldNames.length; i++)
		{
			//File Name with its path
			String fullPath = oldNames[i].getAbsolutePath();
		
			//Full Path excluding file name
			String filePath = fullPath.substring(0,fullPath.lastIndexOf(File.separator));
			
			//File Name with extension only
			String fileName = oldNames[i].getName();
			
			//To rename file with new Name
			File newName = new File(filePath+"\\"+"0"+fileName);
			
			if(oldNames[i].renameTo(newName)) 
			{
				//System.out.println("renamed");
			} 
			else 
			{
				System.out.println(fileName + " Not renamed");
			}
		}
	}	
}