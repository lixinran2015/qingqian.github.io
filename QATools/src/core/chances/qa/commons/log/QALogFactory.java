package chances.qa.commons.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QALogFactory {
	private static final Logger sysLogger = LoggerFactory.getLogger("qa");
	private static final Logger accessLogger = LoggerFactory.getLogger("access");
	
	/**
	 * 系统日志.
	 * @return
	 */
	public static final Logger getSystemLogger() {
		return sysLogger;
	}
	
	/**
	 * 访问日志.
	 * @return
	 */
	public static final Logger getAccessLogger() {
		return accessLogger;
	}
	
}
