package hotfolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;

public class HandlerProcess {
	public File handleFile(File input) {
		try {
			System.out.println("MD5 sum: " + DigestUtils.md5Hex(new FileInputStream(input)));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return input;
	}
}
