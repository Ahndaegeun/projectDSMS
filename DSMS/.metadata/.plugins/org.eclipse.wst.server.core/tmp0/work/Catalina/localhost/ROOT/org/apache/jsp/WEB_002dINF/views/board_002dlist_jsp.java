/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-27 01:16:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.PageVO;
import vo.BoardVO;
import java.util.List;

public final class board_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.BoardVO");
    _jspx_imports_classes.add("vo.PageVO");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>?????? ?????? ?????????</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/board-list.css\">\n");
      out.write("</head>\n");

	List<BoardVO> Emer = (List<BoardVO>) request.getAttribute("BoardList1"); //??????
	List<BoardVO> Bulletin = (List<BoardVO>) request.getAttribute("BoardList2"); //?????? 
	List<BoardVO> Free = (List<BoardVO>) request.getAttribute("BoardList3"); //??????
	String path = (String)request.getAttribute("path");
// 	//???????????? ?????? ?????? ??????
// 	int totalRecord = 0; // ?????? ?????? ??????
// 	int numPerPage = 15; // ??? ???????????? ????????? ?????? ??????
// 	int pagePerBlock = 3; // ??? ????????? ????????? ????????? ???
// 	int totalPage = 0; // ?????? ????????? ???
// 	int totalBlock = 0; //?????? ?????? ???
// 	int nowPage = 0; //?????? ????????? ?????????
// 	int nowBlock = 0; //?????? ????????? ??????
// 	int beginPerPage = 0; //??? ???????????? ?????? ??? ??????


      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"body__container\">\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/main-nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("job", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getMember_job()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("	\n");
      out.write("	<main>\n");
      out.write("		<article class=\"board-list-wrap\">\n");
      out.write("\n");
      out.write("        <div class=\"board-head\">\n");
      out.write("          <form id=\"search-board-frm\" action=\"");
      out.print(request.getContextPath() );
      out.write("/board\" method=\"get\">\n");
      out.write("            <input name=\"searchDa\" type=\"text\" id=\"searchData\" >\n");
      out.write("            <input name=\"cmd\" type=\"hidden\" value=\"searchData\" >\n");
      out.write("            <button type=\"button\" id = \"searchBtn\">??????</button>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("        <div class=\"board-body\">\n");
      out.write("          <div class=\"board-page-wrap\">\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("            	<li>Page</li>\n");
      out.write("            	");
  PageVO pageVO = (PageVO)request.getAttribute("pageVO"); 
            		int pagination = pageVO.getPaginationSize();
            		int pageD = pageVO.getPage();
            		
            	if(pageD != 1){
            	 
      out.write("\n");
      out.write("            	<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=");
      out.print(path );
      out.write("&page=");
      out.print(pageD-1);
      out.write("\">??</a></li>\n");
      out.write("            	");

            	}
            	for(int i = 1; i <= pagination; i++){ 
            		if(pageD == i){
            	
      out.write("\n");
      out.write("            		\n");
      out.write("            		<li class=\"page-click\"><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=");
      out.print(path );
      out.write("&page=");
      out.print(i);
      out.write("&searchDa=");
      out.print(request.getParameter("searchDa") );
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</a></li>\n");
      out.write("              	");

            		}else{
            	
      out.write("		\n");
      out.write("            		<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=");
      out.print(path );
      out.write("&page=");
      out.print(i);
      out.write("&searchDa=");
      out.print(request.getParameter("searchDa") );
      out.write("\"><span class= \"pageIdx\">");
      out.print(i);
      out.write("</span></a></li>\n");
      out.write("            	");
 		
            		}
              	}
            	
      out.write("\n");
      out.write("            	");
 
            	if(pageD != pagination){
            	
      out.write("\n");
      out.write("            	<li><a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=");
      out.print(path );
      out.write("&page=");
      out.print(pageD+1);
      out.write("&searchDa=");
      out.print(request.getParameter("searchDa") );
      out.write("\">??</a></li>\n");
      out.write("            	");

            	}
            	
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"go-to-write\">\n");
      out.write("	            <a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=write\">??? ??????</a>            \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"board-list\">\n");
      out.write("            <ul class=\"list-header\">\n");
      out.write("              <li>??????</li>\n");
      out.write("              <li>??????</li>\n");
      out.write("              <li>?????????</li>\n");
      out.write("              <li>?????????</li>\n");
      out.write("              <li>?????????</li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"list-body\">\n");
      out.write("            \n");
      out.write("            ");

            for(BoardVO bvo : Bulletin){
            
      out.write("\n");
      out.write("              <li class=\"notice-item\">\n");
      out.write("                <span class=\"division\">");
      out.print(bvo.getBoard_category());
      out.write("</span>\n");
      out.write("                <div class=\"title\">\n");
      out.write("	                <a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=detail&idx=");
      out.print(bvo.getBoard_idx() );
      out.write('"');
      out.write('>');
      out.print(bvo.getBoard_title() );
      out.write("</a>                \n");
      out.write("                </div>\n");
      out.write("                <span class=\"author\">");
      out.print(bvo.getMember_name() );
      out.write("</span>\n");
      out.write("                <span class=\"date\">");
      out.print(bvo.getBoard_date() );
      out.write("</span>\n");
      out.write("                <span class=\"hit-count\">");
      out.print(bvo.getBoard_hits() );
      out.write("</span>\n");
      out.write("              </li>             \n");
      out.write("             ");

            		}
             
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            for(BoardVO bvo : Emer){
            
      out.write("\n");
      out.write("              <li class=\"press-item\">\n");
      out.write("                <span class=\"division\">");
      out.print(bvo.getBoard_category());
      out.write("</span>\n");
      out.write("                <div class=\"title\">\n");
      out.write("	                <a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=detail&idx=");
      out.print(bvo.getBoard_idx() );
      out.write('"');
      out.write('>');
      out.print(bvo.getBoard_title() );
      out.write("</a>           \n");
      out.write("                </div>\n");
      out.write("                <span class=\"author\">");
      out.print(bvo.getMember_name() );
      out.write("</span>\n");
      out.write("                <span class=\"date\">");
      out.print(bvo.getBoard_date() );
      out.write("</span>\n");
      out.write("                <span class=\"hit-count\">");
      out.print(bvo.getBoard_hits() );
      out.write("</span>\n");
      out.write("              </li>             \n");
      out.write("             ");

             		} 
             
      out.write("\n");
      out.write("             \n");
      out.write("            ");

            for(BoardVO bvo : Free){
            
      out.write("\n");
      out.write("              <li class=\"normal-item\">\n");
      out.write("                <span class=\"division\">");
      out.print(bvo.getBoard_category());
      out.write("</span>\n");
      out.write("                <div class=\"title\">\n");
      out.write("	                <a href=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=detail&idx=");
      out.print(bvo.getBoard_idx() );
      out.write('"');
      out.write('>');
      out.print(bvo.getBoard_title() );
      out.write("</a>         \n");
      out.write("                </div>\n");
      out.write("                <span class=\"author\">");
      out.print(bvo.getMember_name());
      out.write("</span>\n");
      out.write("                <span class=\"date\">");
      out.print(bvo.getBoard_date() );
      out.write("</span>\n");
      out.write("                <span class=\"hit-count\">");
      out.print(bvo.getBoard_hits() );
      out.write("</span>\n");
      out.write("              </li>             \n");
      out.write("             ");

             		} 
             
      out.write("\n");
      out.write("             \n");
      out.write("<!--              <li class=\"press-item\"> ?????? -->\n");
      out.write("<!--              <li class=\"notice-item\"> ?????? -->\n");
      out.write("<!--              <li class=\"normal-item\"> ?????? -->\n");
      out.write("         </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </article>\n");
      out.write("	</main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/global.js\"></script>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("	$(function(){\n");
      out.write("		$(\"#searchBtn\").on(\"click\", function(){\n");
      out.write("			$('#search-board-frm').submit();\n");
      out.write("		})			\n");
      out.write("	});		\n");
      out.write("	\n");
      out.write("	\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
