package chances.qa.commons.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QALogFactory {
	private static final Logger qaSysLogger = LoggerFactory.getLogger("qaSys");
	private static final Logger accessLogger = LoggerFactory.getLogger("access");
	
	/**
	 * 系统日志.
	 * @return
	 */
	public static final Logger getSystemLogger() {
		return qaSysLogger;
	}
	
	/**
	 * 访问日志.
	 * @return
	 */
	public static final Logger getAccessLogger() {
		return accessLogger;
	}
	
}
