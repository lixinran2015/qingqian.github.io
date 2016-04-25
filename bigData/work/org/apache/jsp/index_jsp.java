package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import pers.bigData.dao.*;
import pers.bigData.vo.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
        WebApplicationContext wac=WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        DimCityDao cdao = (DimCityDao)wac.getBean("daoCity");
        Collection<DimCity> collc=cdao.getAll();
        request.setAttribute("city",collc);
        DimBrandDao bdao = (DimBrandDao)wac.getBean("daoBrand");
        Collection<DimBrand> collb=bdao.getAll();
        request.setAttribute("brand",collb);   
        Collection<RptPrice> colrp= (Collection)request.getAttribute("colrp");      

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write(" <body style=\"background-color:#FFFFB9\">\r\n");
      out.write("    <form id=\"form1\" action=\"RptPriceAction\" method=\"post\" namespace=\"/\">\r\n");
      out.write("     <table border=\"1\" width=\"85%\" borderColor=\"#CDCD9A\">\r\n");
      out.write("     <tr >  \r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>省/自治区/直辖市</b></td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>市/区/县</b></td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>品牌</b></td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>厂商</b></td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>车系</b></td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>年限</b></td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:100px;\" align=\"center\"><b>车型</b></td>\r\n");
      out.write("     <div style=\"position:absolute;left:1160px;top:20px;\">\r\n");
      out.write("     <input type=\"submit\" value=\"查询\" cssClass=\"color:#FFFFFF;background-color:#019858;\" />\r\n");
      out.write("     \r\n");
      out.write("     </div>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \r\n");
      out.write("     <tr> \r\n");
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> ");

       for(DimCity a : collc){ 
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
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> ");

       for(DimCity a : collc){ 
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
      out.write("     </td>     \r\n");
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select name=\"rpt.brand_code\" id=\"brandCode\" onChange=\"reload(this.value)\" >> \r\n");
      out.write("       <option value=0>--请选择--</option> ");

       for(DimBrand b : collb){ 
      out.write("\r\n");
      out.write("               <option value=");
      out.print(b.getBrand_code());
      out.write(">\r\n");
      out.write("                  ");
      out.print(b.getBrand_name());
      out.write("\r\n");
      out.write("               </option>  \r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("     </td>   \r\n");
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> \r\n");
      out.write("      </select>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> \r\n");
      out.write("      </select>\r\n");
      out.write("     </td>\r\n");
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> \r\n");
      out.write("      </select>\r\n");
      out.write("     </td>\r\n");
      out.write("     \r\n");
      out.write("     <td colspan=\"2\"> \r\n");
      out.write("       <select> \r\n");
      out.write("       <option value=0>--请选择--</option> \r\n");
      out.write("      </select>\r\n");
      out.write("     </td>\r\n");
      out.write("     </tr>               \r\n");
      out.write("    </table>   \r\n");
      out.write("    </form>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    \r\n");
      out.write("     <table border=\"1\" width=\"70%\" borderColor=\"#CDCD9A\">\r\n");
      out.write("     <tr width=\"70%\">  \r\n");
      out.write("     <td colspan=\"4\" style=\"width:100px;\" align=\"center\"><b>厂商指导价(元)</b></td>\r\n");
      out.write("     <td colspan=\"6\" style=\"width:100px;\" align=\"center\"><b>新车实际成交价(元)</b></td>\r\n");
      out.write("     <td colspan=\"6\" style=\"width:100px;\" align=\"center\"><b>新车实际成交价(含税)(元)</b></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr >  \r\n");
      out.write("     <td colspan=\"2\" style=\"width:50px;height:20px\" align=\"center\">原车型</td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:50px;height:20px\" align=\"center\">父车型</td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:50px;height:20px\" align=\"center\">原车型</td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:33px;\" align=\"center\">父车型</td>\r\n");
      out.write("      <td colspan=\"2\" style=\"width:33px;\" align=\"center\"><div style=\"color:#8F4586;\"> <b>修正价</b>\r\n");
      out.write("     </div>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:33px;\" align=\"center\">原车型</td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:33px;\" align=\"center\">父车型</td>\r\n");
      out.write("     <td colspan=\"2\" style=\"width:33px;\" align=\"center\"><div style=\"color:#8F4586;\"> <b>修正价</b>\r\n");
      out.write("     </div>\r\n");
      out.write("     </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("  ");

         if ( null != colrp && ! colrp.isEmpty() ){        
         for (Iterator iter = colrp.iterator(); iter.hasNext();) {
            RptPrice ddd = (RptPrice)iter.next();
            
      out.write("\r\n");
      out.write("            <tr >       \r\n");
      out.write("           <td colspan=\"2\" style=\"width:50px;height:20px\" align=\"center\">\r\n");
      out.write("            ");
      out.print(ddd.getGuide_price());
      out.write("\r\n");
      out.write("              </td>\r\n");
      out.write("          <td colspan=\"2\" style=\"width:50px;height:20px\" align=\"center\"> \r\n");
      out.write("          ");
      out.print(ddd.getBare_price());
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          </td> \r\n");
      out.write("          <td colspan=\"2\" style=\"width:33px;height:20px\" align=\"center\"> \r\n");
      out.write("          ");
      out.print(ddd.getDeal_price());
      out.write("\r\n");
      out.write("           </td>\r\n");
      out.write("           \r\n");
      out.write("           <td colspan=\"2\" style=\"width:33px;height:20px\" align=\"center\"> </td>\r\n");
      out.write("          <td colspan=\"2\" style=\"width:33px;height:20px\" align=\"center\"> <div style=\"color:#8F4586;\"> <b> </b>\r\n");
      out.write("          </div>\r\n");
      out.write("            <td colspan=\"2\" style=\"width:33px;height:20px\" align=\"center\"> </td>\r\n");
      out.write("          <td colspan=\"2\" style=\"width:33px;height:20px\" align=\"center\"> </td>\r\n");
      out.write("          <td colspan=\"2\" style=\"width:33px;height:20px\" align=\"center\"><div style=\"color:#8F4586;\"> <b> </b>\r\n");
      out.write("         </div>\r\n");
      out.write("         </tr>\r\n");

}                   
}    
  
      out.write("\r\n");
      out.write("     </table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
