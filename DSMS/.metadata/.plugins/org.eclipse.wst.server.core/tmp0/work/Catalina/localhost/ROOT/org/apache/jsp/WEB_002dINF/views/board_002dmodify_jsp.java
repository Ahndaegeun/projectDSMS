/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-27 01:17:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.BoardVO;

public final class board_002dmodify_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("vo.BoardVO");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>대덕 인재 개발원</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/board-modify.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://uicdn.toast.com/editor/latest/toastui-editor.min.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");

	BoardVO boardInfo = (BoardVO) request.getAttribute("boardInfo");
	
      out.write("\n");
      out.write("<div class=\"body__container\">\n");
      out.write("\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/main-nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("job", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getMember_job()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("<main>\n");
      out.write("	<article class=\"board-modify-wrap\">\n");
      out.write("        <form id=\"modify-wrap-frm\" method=\"post\" \n");
      out.write("        	action=\"");
      out.print(request.getContextPath() );
      out.write("/board?cmd=update\">\n");
      out.write("          <ul class=\"top\">\n");
      out.write("            <li class=\"title-wrap\">\n");
      out.write("              <input type=\"text\" class=\"title\" name=\"board_title\" value=\"");
      out.print(boardInfo.getBoard_title() );
      out.write("\" placeholder=\"제목을 입력하세요.\">\n");
      out.write("              <button type=\"button\" class=\"modify-btn\">수정</button>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"description\">\n");
      out.write("              <div class=\"radio-wrap\">\n");
      out.write("	              <label><input type=\"radio\" name=\"board_category\" value=\"2\">공지</label>\n");
      out.write("	              <label><input type=\"radio\" name=\"board_category\" value=\"1\">긴급</label>\n");
      out.write("	              <label><input type=\"radio\" name=\"board_category\" value=\"3\">일반</label>\n");
      out.write("              </div>\n");
      out.write("              <input type=\"file\" class=\"file\">\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <div id=\"editor\"></div>\n");
      out.write("          <input type=\"hidden\" name=\"board_content\" id=\"board_content\" value=\"");
      out.print(boardInfo.getBoard_content() );
      out.write("\">\n");
      out.write("          <input type=\"hidden\" name=\"member_idx\" id=\"member_idx\" value=\"");
      out.print(boardInfo.getMember_idx() );
      out.write("\">\n");
      out.write("          <input type=\"hidden\" name=\"board_idx\" id=\"board_idx\" value=\"");
      out.print(boardInfo.getBoard_idx() );
      out.write("\">\n");
      out.write("        </form>\n");
      out.write("      </article>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/global.js\"></script>\n");
      out.write("<script \n");
      out.write("	src=\"https://uicdn.toast.com/editor/latest/toastui-editor-all.min.js\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("const Editor = toastui.Editor;\n");
      out.write("debugger;\n");
      out.write("const editor = new Editor({\n");
      out.write("	  el: document.querySelector('#editor'),\n");
      out.write("	  height: '480px',\n");
      out.write("	  initialEditType: 'wysiwyg',\n");
      out.write("	  initialValue : document.querySelector('#board_content').value,\n");
      out.write("	  previewStyle: 'vertical'\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("	$(\".modify-btn\").on(\"click\", function(){\n");
      out.write("		console.log($('#board_content').val());\n");
      out.write("		console.log(editor.getHTML());\n");
      out.write("		console.log(editor.getMarkdown());\n");
      out.write("		if($(\"input[name='board_category']:checked\").length==0){\n");
      out.write("			alert('카테고리를 체크하세요');\n");
      out.write("			return false;\n");
      out.write("		}\n");
      out.write("		$('#board_content').val(editor.getMarkdown());\n");
      out.write("		$('#modify-wrap-frm').submit();\n");
      out.write("	})			\n");
      out.write("});	\n");
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
