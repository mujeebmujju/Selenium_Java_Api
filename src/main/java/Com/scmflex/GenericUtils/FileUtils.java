package Com.scmflex.GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils 
{
	/**
	 * This method is used to read data from Property file
	 * @author Mujeeb
	 * @param key
	 * @return
	 * @throws IOException 
	 * @throws Throwable
	 */
	public String readDataFromPropertyFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(IPathConstants.Filepath);
		Properties pLib = new Properties();
		pLib.load(fis);
		String value = pLib.getProperty(key);
		return value;
		
	}

}
