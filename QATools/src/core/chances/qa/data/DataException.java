package chances.qa.data;

import chances.qa.exception.QARuntimeException;

/**
 * 数据访问异常.
 * 
 * @author Elysium  
 * 
 */
public class DataException extends QARuntimeException {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 7398098227483354755L;

    public DataException(final String message, final Throwable cause) {
        super(message, cause);
    }

    @Override
    protected String getErrorCode() {
        return QARuntimeException.DB_ERROR;
    }

}
