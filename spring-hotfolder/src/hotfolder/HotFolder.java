package hotfolder;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HotFolder {
	public static void main(String[] args) throws Exception, BeansException {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"resources/hotfolder-spring.xml");
		
		context = null;
	}
}
