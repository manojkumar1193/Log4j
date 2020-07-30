package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String args[]) {
		log.debug("I am debugging");
		log.info("i will display information");
		log.error("i will display error messages");
		log.fatal("i will display fatal messages");
	}

}
