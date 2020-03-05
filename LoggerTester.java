package cloudwatchlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTester {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTester.class);

	public static void main(String[] args) {

		//Set this before the logger start.
        logger.info("Msg #1");
        logger.warn("Msg #2");
        logger.error("Msg #3");
        logger.debug("Msg #4");
	}

	private void start() {

        logger.debug("------ Starting Ant------");
     	//...
	}
}
