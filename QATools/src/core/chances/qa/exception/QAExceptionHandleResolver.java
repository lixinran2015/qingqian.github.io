package chances.qa.exception;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import chances.qa.commons.log.QALogFactory;

/**
 * 统一异常处理   
 *  
 * @author <a href="mailto:libf@chances.com.cn">libf</a>
 */
public class QAExceptionHandleResolver  implements HandlerExceptionResolver {
    protected final Logger logger = QALogFactory.getSystemLogger();

    // protected MessageSource messageSource;

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.springframework.web.servlet.HandlerExceptionResolver#resolveException
     * (javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse, java.lang.Object,
     * java.lang.Exception)
     */
    @Override
    public ModelAndView resolveException(final HttpServletRequest req,
            final HttpServletResponse res, final Object handler, final Exception ex) {
        ModelAndView mv = null;
        mv = new ModelAndView("/common/error/error.jsp");

        logger.error(ex.getMessage(), ex);

        if (ex instanceof QARuntimeException) {
            final QARuntimeException ere = (QARuntimeException) ex;
            mv.addObject("errorCode", ere.getErrorCode());
        } else {
            if (ex instanceof NullPointerException) {
                mv.addObject("errorCode", "0001");
            } else if (ex instanceof ArrayIndexOutOfBoundsException) {
                mv.addObject("errorCode", "0006");
            } else if (ex instanceof IndexOutOfBoundsException) {
                mv.addObject("errorCode", "0002");
            } else if (ex instanceof UncategorizedSQLException) {
                mv.addObject("errorCode", "0004");
            } else if (ex instanceof SQLException) {
                mv.addObject("errorCode", "0005");
            } else {
                mv.addObject("errorCode", "0000");
            }
        }

        return mv;
    }

    /*
     * private String buildMessage(String errorCode,Object[] args) { return
     * messageSource.getMessage(errorCode, args, "", null); }
     *//**
     * @param messageSource
     *            the messageSource to set
     */
    /*
     * public void setMessageSource(MessageSource messageSource) {
     * this.messageSource = messageSource; }
     */
}
