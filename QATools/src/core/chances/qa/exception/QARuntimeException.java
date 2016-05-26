package chances.qa.exception;

public abstract class QARuntimeException extends RuntimeException {
    private static final long serialVersionUID = -7248097351375674441L;

    public static final String INVALID_CONFIG = "1001";
    public static final String INVALID_USER = "1002";
    public static final String INVALID_DATA = "1003";
    public static final String INVALID_PARAM = "1004";

    public static final String ACC_INVALID_CONTAINER = "2001";
    public static final String ACC_ITEM_NOT_FOUND = "2002";
    public static final String ACC_ILLEGAL_CONTAINER = "2003";
    public static final String ACC_BIZ_NOT_FOUND = "2004";
    public static final String ACC_TEMPLATE_NOT_FOUND = "2005";
    public static final String ACC_INVALID_ITEMTYPE = "2006";
    public static final String ACC_POSITION_NOT_FOUND = "2007";
    public static final String ACC_CONTENT_NOT_FOUND = "2008";

    public static final String HTML_MEARGE_ERROR = "9001";
    public static final String DB_ERROR = "9998";
    public static final String SYSTEM_ERROR = "9999";

    public QARuntimeException(final String message) {
        super(message);
    }

    public QARuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * 错误代码.
     * 
     * @return
     */
    protected abstract String getErrorCode();
}
