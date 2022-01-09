/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-27 01:15:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.FileVO;
import java.util.Map;
import java.util.List;
import vo.CommentVO;
import vo.BoardVO;

public final class board_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("vo.FileVO");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("vo.CommentVO");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

BoardVO boardInfo = (BoardVO) request.getAttribute("boardInfo");
List<Map<String, Object>> commentList = (List<Map<String, Object>>) request.getAttribute("commentList");
FileVO fileVo = new FileVO();
if ((FileVO) request.getAttribute("file") != null) {
	fileVo = (FileVO) request.getAttribute("file");
} ;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>대덕 인재 개발원</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/board-detail.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("	<div class=\"body__container\">\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/main-nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("job", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getMember_job()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("\n");
      out.write("		<main>\n");
      out.write("\n");
      out.write("			<article class=\"board-detail-wrap\">\n");
      out.write("				<div class=\"inner\">\n");
      out.write("\n");
      out.write("					<ul class=\"top\">\n");
      out.write("						<li class=\"title-wrap\">\n");
      out.write("							<div class=\"title\">");
      out.print(boardInfo.getBoard_title());
      out.write("</div>\n");
      out.write("							<div class=\"title-btn-wrap\">\n");
      out.write("								<button class=\"modify-btn\"\n");
      out.write("									onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/board?cmd=modify&idx=");
      out.print(boardInfo.getBoard_idx());
      out.write("'\">수정</button>\n");
      out.write("\n");
      out.write("								<button class=\"delete-btn\"\n");
      out.write("									onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/board?cmd=delete&idx=");
      out.print(boardInfo.getBoard_idx());
      out.write("'\">삭제</button>\n");
      out.write("								<input type=\"hidden\" name=\"board_idx\" id=\"board_idx\"\n");
      out.write("									value=\"");
      out.print(boardInfo.getBoard_idx());
      out.write("\"> <input\n");
      out.write("									type=\"hidden\" id=\"login_mem_job\"\n");
      out.write("									value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getMember_job()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> <input type=\"hidden\"\n");
      out.write("									id=\"login_mem_idx\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getMember_idx()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("							</div>\n");
      out.write("						</li>\n");
      out.write("						<li class=\"description\"><span class=\"author\">");
      out.print(boardInfo.getMember_name());
      out.write("</span>\n");
      out.write("							<span class=\"date\">");
      out.print(boardInfo.getBoard_date());
      out.write("</span> <span\n");
      out.write("							class=\"hit-count\">조회수 <span class=\"count\">");
      out.print(boardInfo.getBoard_hits());
      out.write("</span></span>\n");
      out.write("							");

							if ((FileVO) request.getAttribute("file") != null) {
							
      out.write(" <span\n");
      out.write("							class=\"file\"><a\n");
      out.write("								href=\"");
      out.print(request.getContextPath());
      out.write("/board?cmd=file_download&idx=");
      out.print(boardInfo.getBoard_idx());
      out.write('"');
      out.write('>');
      out.print(fileVo.getFile_name());
      out.print(fileVo.getFile_type());
      out.write("</a></span>\n");
      out.write("							");

							}
							
      out.write("</li>\n");
      out.write("					</ul>\n");
      out.write("\n");
      out.write("					<div class=\"content\">\n");
      out.write("						");
      out.print(boardInfo.getBoard_content());
      out.write("\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<div class=\"comment\">\n");
      out.write("						<form action=\"\" id=\"insertComment-frm\">\n");
      out.write("							<textarea id=\"commentContent\"></textarea>\n");
      out.write("							<button type=\"button\" class=\"writeComment-btn\" onclick=\"\">입력</button>\n");
      out.write("						</form>\n");
      out.write("						<br>\n");
      out.write("						<ul class=\"comment-list\">\n");
      out.write("							");

							for (int i = 0; i < commentList.size(); i++) {
							
      out.write("\n");
      out.write("							<li class=\"comment-item\">\n");
      out.write("								<div class=\"info\">\n");
      out.write("									<span class=\"author\">");
      out.print(commentList.get(i).get("MEMBER_NAME"));
      out.write("\n");
      out.write("										<span class=\"date\">");
      out.print(commentList.get(i).get("COMMENT_DATE"));
      out.write("</span></span>\n");
      out.write("									<div class=\"info-btns\">\n");
      out.write("										<button type=\"button\" class=\"modify-btn\" onclick=\"\">수정</button>\n");
      out.write("										<button type=\"button\" id=\"deleteComment\" class=\"delete-btn\">삭제</button>\n");
      out.write("										<input type=\"hidden\" id=\"comment_idx\"\n");
      out.write("											value=\"");
      out.print(commentList.get(i).get("COMMENT_IDX"));
      out.write("\">\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("								<div class=\"content\">\n");
      out.write("									<sapn id=\"comment_content_btn\"> ");
      out.print(commentList.get(i).get("COMMENT_CONTENT"));
      out.write("\n");
      out.write("									</sapn>\n");
      out.write("\n");
      out.write("									<div id=\"comment_div\" style=\"display: none;\">\n");
      out.write("										<textarea id=\"updateContent\">");
      out.print(commentList.get(i).get("COMMENT_CONTENT"));
      out.write("</textarea>\n");
      out.write("										<div class=\"modify-btn-wrap\">\n");
      out.write("											<button type=\"button\" class=\"comment_update_btn\" onclick=\"\">수정</button>\n");
      out.write("											<button type=\"button\" class=\"comment_cancel_btn\">취소</button>										\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("							</li>\n");
      out.write("							");

							}
							
      out.write("\n");
      out.write("						</ul>\n");
      out.write("					</div>\n");
      out.write("			</article>\n");
      out.write("		</main>\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/global.js\"></script>\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/board-detail.js\"></script>\n");
      out.write("	<script>\n");
      out.write("		const loginMemJob = document.querySelector('#login_mem_job').value;\n");
      out.write("		const loginMemIdx = parseInt(document.querySelector('#login_mem_idx').value);\n");
      out.write("		const boardMemIdx = parseInt(");
      out.print(boardInfo.getMember_idx());
      out.write(");\n");
      out.write("\n");
      out.write("		//관리자가 아니면서 본인이 작성한 게시물이 아닌 경우\n");
      out.write("		if (loginMemJob !== '0' && boardMemIdx !== loginMemIdx) {\n");
      out.write("			document.querySelector('.modify-btn').style.visibility = 'hidden';\n");
      out.write("			document.querySelector('.delete-btn').style.visibility = 'hidden';\n");
      out.write("			\n");
      out.write("			//관리자면서 본인이 작성한 게시물이 아닌 경우\n");
      out.write("		} else if (loginMemJob == '0' && boardMemIdx != loginMemIdx) {\n");
      out.write("			document.querySelector('.modify-btn').style.visibility = 'hidden';\n");
      out.write("		} else {\n");
      out.write("			document.querySelector('.modify-btn').style.visibility = 'visible';\n");
      out.write("			document.querySelector('.delete-btn').style.visibility = 'visible';\n");
      out.write("		}\n");
      out.write("\n");
      out.write("		$(\".writeComment-btn\").on(\"click\", function() { //댓글 작성 눌렀을때\n");
      out.write("			const param = {\n");
      out.write("				comment_content : $(\"#commentContent\").val(),\n");
      out.write("				board_idx : $(\"#board_idx\").val(),\n");
      out.write("				member_idx : $(\"#login_mem_idx\").val()\n");
      out.write("			};\n");
      out.write("\n");
      out.write("			$.ajax({\n");
      out.write("				type : \"POST\",\n");
      out.write("				url : '/board?cmd=commentWrite',\n");
      out.write("				dataType : 'json',\n");
      out.write("				data : param,\n");
      out.write("				success : function(res) {\n");
      out.write("					if(res.board_idx !== ''){\n");
      out.write("						let code = '<li class=\"comment-item\">'\n");
      out.write("						code += '<div class=\"info\">'\n");
      out.write("						code += '<span class=\"author\">' + res.member_name\n");
      out.write("						code += '<span class=\"date\">' + res.comment_date.substring(0, 11) + '</span></span>'\n");
      out.write("						code += '<div class=\"info-btns\">'\n");
      out.write("						code += '<button type=\"button\" class=\"modify-btn\" onclick=\"\">수정</button>'\n");
      out.write("						code += '<button type=\"button\" id=\"deleteComment\" class=\"delete-btn\">삭제</button>'\n");
      out.write("						code += '<input type=\"hidden\" id=\"comment_idx\" value=\"' + res.member_idx + '\">'\n");
      out.write("						code += '</div>'\n");
      out.write("						code += '</div>'\n");
      out.write("						code += '<div class=\"content\">'\n");
      out.write("						code += '<sapn id=\"comment_content_btn\">' + res.comment_content\n");
      out.write("						code += '</span>'\n");
      out.write("						code += '<div id=\"comment_div\" style=\"display: none;\">'\n");
      out.write("						code += '<textarea id=\"updateContent\">' + res.comment_content + '</textarea>'\n");
      out.write("						code += '<button type=\"button\" id=\"comment_update_btn\" onclick=\"\">입력</button>'\n");
      out.write("						code += '<button type=\"button\" id=\"comment_cancel_btn\">취소</button>'\n");
      out.write("						code += '</div></div></div>'\n");
      out.write("						code += '</li>'\n");
      out.write("						$('.comment-list').append(code)\n");
      out.write("						$('#commentContent').val(\"\")\n");
      out.write("					}\n");
      out.write("				},\n");
      out.write("				error : function(e) {\n");
      out.write("					console.log(e)\n");
      out.write("				},\n");
      out.write("\n");
      out.write("			})\n");
      out.write("			\n");
      out.write("		})\n");
      out.write("		\n");
      out.write("\n");
      out.write("		$(\"#deleteComment\").on(\"click\", function(e) {\n");
      out.write("			const param2 = {\n");
      out.write("				board_idx : $(\"#board_idx\").val(),\n");
      out.write("				comment_idx : $(\"#comment_idx\").val()\n");
      out.write("			};\n");
      out.write("			console.log(param2)\n");
      out.write("			\n");
      out.write("			$.ajax({\n");
      out.write("				type : \"GET\",\n");
      out.write("				url : \"/board?cmd=deleteComment\",\n");
      out.write("				data : param2,\n");
      out.write("				success : function(res) {\n");
      out.write("					alert(\"댓글 삭제완료!\");\n");
      out.write("					location.reload();\n");
      out.write("\n");
      out.write("				},\n");
      out.write("				error : function(e) {\n");
      out.write("					console.log(e)\n");
      out.write("				},\n");
      out.write("			})\n");
      out.write("		})\n");
      out.write("\n");
      out.write("		$(\".modify-btn\").on(\"click\", function() { //수정눌렀을때 \n");
      out.write("			$(\"#comment_content_btn\").hide();\n");
      out.write("			$(\"#comment_div\").show();\n");
      out.write("			$(\".modify-btn\").hide();\n");
      out.write("			$(\"#deleteComment\").hide();\n");
      out.write("		})\n");
      out.write("\n");
      out.write(" 		$('.comment_update_btn').on(\"click\", function(e) { //댓글 수정을 눌렀을때\n");
      out.write("			$(\"#comment_content_btn\").show();\n");
      out.write("			$(\"#comment_div\").hide();\n");
      out.write("			const param3 = {\n");
      out.write("				comment_content : $(\"#updateContent\").val(),\n");
      out.write("				board_idx : $(\"#board_idx\").val(),\n");
      out.write("				comment_idx : $(\"#comment_idx\").val()\n");
      out.write("			};\n");
      out.write("\n");
      out.write("			$.ajax({\n");
      out.write("				type : \"POST\",\n");
      out.write("				url : '/board?cmd=modifyCommnet',\n");
      out.write("				//dataType : 'json' \n");
      out.write("				data : param3,\n");
      out.write("				success : function(res) {\n");
      out.write("					const text = param3.comment_content\n");
      out.write("					$(\"#comment_content_btn\").html(text)\n");
      out.write("					$(\"#comment_content_btn\").show();\n");
      out.write("					$(\"#comment_div\").hide();\n");
      out.write("					$(\".modify-btn\").show();\n");
      out.write("					$(\"#deleteComment\").show();\n");
      out.write("				},\n");
      out.write("				error : function(e) {\n");
      out.write("					console.log(e)\n");
      out.write("				},\n");
      out.write("\n");
      out.write("			})\n");
      out.write("\n");
      out.write("		});\n");
      out.write("\n");
      out.write("		$(\".comment_cancel_btn\").on(\"click\", function() { //댓글 취소를 눌렀을때\n");
      out.write("			$(\"#comment_content_btn\").show();\n");
      out.write("			$(\"#comment_div\").hide();\n");
      out.write("			$(\".modify-btn\").show();\n");
      out.write("			$(\"#deleteComment\").show();\n");
      out.write("		});\n");
      out.write("	</script>\n");
      out.write("\n");
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