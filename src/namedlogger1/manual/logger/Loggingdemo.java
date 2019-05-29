/**
 * 
 */
package namedlogger1.manual.logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Shubham
 *
 */
public class Loggingdemo {
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger named = LogManager.getLogger(Loggingdemo.class.getPackageName());
		named.debug("this is a test debug message");
		named.info("this is an info message");
		named.trace("this is a trace message");
		named.error("this is an error message");
		
	}

}
