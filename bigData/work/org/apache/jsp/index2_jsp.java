package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import pers.bigData.dao.*;
import pers.bigData.data.service.*;
import pers.bigData.vo.*;
import java.util.*;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        ContentService cs = (ContentService) wac.getBean("contentService");
        List<DimCity> coll = cs.getDimCitys();
        request.setAttribute("city",coll);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<s:action name=\"rptPrice\" executeResult=\"true\" />\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    This is my JSP page. <br>\r\n");
      out.write("     <table>\r\n");
      out.write("     <tr>  \r\n");
      out.write("     <td style=\"width:100px;\"><h4>省名称</h4></td>\r\n");
      out.write("     <td> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> ");

       for(DimCity a : coll){ 
      out.write("\r\n");
      out.write("               <option value=");
      out.print(a.getProv_code());
      out.write(">\r\n");
      out.write("                  ");
      out.print(a.getProv_name());
      out.write("\r\n");
      out.write("               </option>  \r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("     </td>\r\n");
      out.write("        </tr>  \r\n");
      out.write("     </tr>               \r\n");
      out.write("    </table>   \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
