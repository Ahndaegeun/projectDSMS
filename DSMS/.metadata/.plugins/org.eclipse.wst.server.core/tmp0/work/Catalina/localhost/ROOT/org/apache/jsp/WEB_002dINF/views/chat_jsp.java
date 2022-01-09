/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.69
 * Generated at: 2021-09-27 01:02:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.MemberVO;
import vo.ChatRoomVO;
import vo.ChatListVO;
import vo.ChatDetailVO;
import java.util.List;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("vo.ChatDetailVO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("vo.ChatListVO");
    _jspx_imports_classes.add("vo.MemberVO");
    _jspx_imports_classes.add("vo.ChatRoomVO");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

List<ChatListVO> chatRoomList = (List<ChatListVO>) request.getAttribute("chatRoom");
List<MemberVO> memberList = (List<MemberVO>) request.getAttribute("memberList");
// int member_idx = (int) request.getSession().getAttribute("member_idx");
MemberVO mvo = (MemberVO) request.getSession().getAttribute("user");
int member_idx = mvo.getMember_idx();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>대덕 인재 개발원</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/chat.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"body__container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "main-nav.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("job", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.getMember_job()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<main>\r\n");
      out.write("		<section>\r\n");
      out.write("		\r\n");
      out.write("			<article class=\"list\">\r\n");
      out.write("				<form action=\"\">\r\n");
      out.write("					<input type=\"text\" placeholder=\"대화방 검색\" id=\"search-chat-room\"/>\r\n");
      out.write("					<button type=\"button\"><img src=\"../storage/img/addBtn.png\" alt=\"add\" /></button>\r\n");
      out.write("				</form>\r\n");
      out.write("					<div class=\"layer-wrap hidden\">\r\n");
      out.write("			            <div class=\"pop-up\">\r\n");
      out.write("			              <form action=\"\" id=\"pop-up-frm\"></form>\r\n");
      out.write("			              <ul class=\"mem-list\">\r\n");
      out.write("			                <li><button type=\"button\" id=\"create-room-btn\">방 생성</button></li>\r\n");
      out.write("			                ");

			                for (MemberVO list : memberList) {
			                
      out.write("\r\n");
      out.write("			                <li>\r\n");
      out.write("			                  <label><input form=\"pop-up-frm\" type=\"checkbox\" id=\"member-check\" name=\"name\" value=\"");
      out.print(list.getMember_idx());
      out.write('"');
      out.write('>');
      out.print(list.getMember_name() );
      out.write("</label>\r\n");
      out.write("			                </li>\r\n");
      out.write("			                ");

							}
							
      out.write("\r\n");
      out.write("			              </ul>\r\n");
      out.write("			            </div>\r\n");
      out.write("			        </div>\r\n");
      out.write("				<ul class=\"chat-list-wrap\">\r\n");
      out.write("				");

				for (ChatListVO list : chatRoomList) {
				
      out.write("\r\n");
      out.write("					<li class=\"chat-list-item\" name=\"");
      out.print(list.getChat_room_idx() );
      out.write("\" onclick=\"chatRoomIn(");
      out.print(list.getChat_room_idx() );
      out.write(")\">\r\n");
      out.write("						<span name=\"");
      out.print(list.getChat_room_idx() );
      out.write("\">- ");
      out.print(list.getMember_name() );
      out.write("</span>\r\n");
      out.write("						<span name=\"");
      out.print(list.getChat_room_idx() );
      out.write("\" class=\"last-msg\">");
      out.print(list.getChat_detail_content() );
      out.write("</span>\r\n");
      out.write("					</li>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</article>\r\n");
      out.write("			\r\n");
      out.write("			<article class=\"contents-wrap\">\r\n");
      out.write("				<div class=\"user\"></div>\r\n");
      out.write("				<div class=\"contents\">\r\n");
      out.write("					<!-- 채팅 내용 -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<form onsubmit=\"return false\">\r\n");
      out.write("					<input type=\"text\" id=\"chat-input\" autocomplete=\"off\" onkeyup=\"enterKey()\"/>\r\n");
      out.write("					<button type=\"button\" id=\"submit-btn\" onclick=\"sendMessage()\">전송</button>\r\n");
      out.write("<!-- 					<button type=\"button\" id=\"submit-btn\">전송</button> -->\r\n");
      out.write("				</form>\r\n");
      out.write("			</article>\r\n");
      out.write("			\r\n");
      out.write("		</section>\r\n");
      out.write("	</main>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../js/global.js\"></script>\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"../js/chat.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("let roomNumber;\r\n");
      out.write("\r\n");
      out.write("// 	$('.chat-list-item').on('click', function() {\r\n");
      out.write("	$('.list ul').on('click', $('.chat-list-item'), function(e) {\r\n");
      out.write("		roomNumber = e.target.getAttribute('name')\r\n");
      out.write("		if(e.currentTarget.classList[0] === 'mem-list') {\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url: '/chat?cmd=chattingDetail',\r\n");
      out.write("			data: {\r\n");
      out.write("				room : roomNumber\r\n");
      out.write("			},\r\n");
      out.write("			success: function(res) {\r\n");
      out.write("				let code = '<ul>';\r\n");
      out.write("				$.each(res, function(i) {\r\n");
      out.write("					let str = res[i].allMemberName;\r\n");
      out.write("					$('.user').html(str);\r\n");
      out.write("					\r\n");
      out.write("					if (\"");
      out.print(member_idx);
      out.write("\" === res[i].memberIdx) {\r\n");
      out.write("						code += '<li class=\"me\">'\r\n");
      out.write("					} else {\r\n");
      out.write("						code += '<li class=\"other\">'\r\n");
      out.write("						code += 	'<span class=\"name\">' + res[i].memberName + '</span>';\r\n");
      out.write("					}\r\n");
      out.write("				code +=		'<span class=\"item\">' + res[i].chatDetailContent + '</span>';\r\n");
      out.write("				code +=		'<span class=\"date\">' + res[i].chatDetailDate + '</span>';						\r\n");
      out.write("				code += '</li>';\r\n");
      out.write("				});\r\n");
      out.write("				code += '</ul>';\r\n");
      out.write("				$('.contents').html(code);\r\n");
      out.write("				contents.scrollTop = 9999;\r\n");
      out.write("// 				console.log(webSocket);\r\n");
      out.write("			},\r\n");
      out.write("			dataType : 'json'\r\n");
      out.write("		})\r\n");
      out.write("	})\r\n");
      out.write("	\r\n");
      out.write("	$('#search-chat-room').keyup(function(){\r\n");
      out.write("		let word = $(this).val()\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url : '/chat?cmd=searchChatRoom',\r\n");
      out.write("			data : {\r\n");
      out.write("				searchWord : word\r\n");
      out.write("			},\r\n");
      out.write("			success : function(res){\r\n");
      out.write("				let code = '';\r\n");
      out.write("				$.each(res, function(i) {\r\n");
      out.write("					code += '<li class=\"chat-list-item\" name=\"' + res[i].chatRoomIdx + '\" onclick=\"chatRoomIn(' + res[i].chatRoomIdx + ')\">';\r\n");
      out.write("					code += '<span name=\"' + res[i].chatRoomIdx + '\">- ' + res[i].memberName + '</span>';\r\n");
      out.write("					code += '<span name=\"' + res[i].chatRoomIdx + '\" class=\"last-msg\">' + res[i].chatDetailContent + '</span>';\r\n");
      out.write("					code += '</li>';\r\n");
      out.write("				});\r\n");
      out.write("				$('.list .chat-list-wrap').html(code);\r\n");
      out.write("			},\r\n");
      out.write("			error : function(e) {\r\n");
      out.write("				console.log(e)\r\n");
      out.write("			},\r\n");
      out.write("			dataType : 'json'\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	// -------------------------------------------------------------------------------\r\n");
      out.write("	// 웹소켓\r\n");
      out.write("	// -------------------------------------------------------------------------------\r\n");
      out.write("	var webSocket = null; // 웹소켓 변수 선언\r\n");
      out.write("    var contents = document.querySelector(\".contents\"); // 채팅방 내용 출력되는 부분\r\n");
      out.write("   	var chatInput = document.querySelector(\"#chat-input\"); // 채팅 내용 입력하는 부분\r\n");
      out.write("   	var userText = ");
      out.print(member_idx);
      out.write("\r\n");
      out.write("//    	var date = new Date();\r\n");
      out.write("//    	const formatDate = (current_datetime) => {\r\n");
      out.write("// 		let format_date = current_datetime.getFullYear() + \"-\" + (current_datetime.getMonth() + 1) + \"-\" + current_datetime.getDate() + \" \" + current_datetime.getHours() + \":\" + current_datetime.getMinutes();\r\n");
      out.write("// 		return format_date;\r\n");
      out.write("//    	}\r\n");
      out.write("\r\n");
      out.write("   	if(webSocket==null){\r\n");
      out.write("		connecting();\r\n");
      out.write("	}\r\n");
      out.write("   	\r\n");
      out.write("   	function connecting() {\r\n");
      out.write("   		//웹소켓 초기화\r\n");
      out.write("   	    webSocket = new WebSocket(\"ws://192.168.0.4:8088/webSocketChatting\");\r\n");
      out.write("   	    // 처음 접속 성공하면 \r\n");
      out.write("   	    webSocket.onopen = function onOpen(event) {\r\n");
      out.write("			console.log('접속 성공 ~ ~ ')\r\n");
      out.write("   	        webSocket.send(createMessage(\"connect\", \"9999\", userText));\r\n");
      out.write("   	    }\r\n");
      out.write("   	    \r\n");
      out.write("   	    //메시지가 오면 contents요소에 메시지를 추가한다.\r\n");
      out.write("   	    webSocket.onmessage = function processMessage(message) {\r\n");
      out.write("   	        //Json 풀기\r\n");
      out.write("   	        var jsonData = JSON.parse(message.data);\r\n");
      out.write("   	        if (jsonData.message != null) {\r\n");
      out.write("   	        	console.log(jsonData)\r\n");
      out.write("	   	        let msg = '';\r\n");
      out.write("				if (");
      out.print(member_idx);
      out.write(" === parseInt(jsonData.member_idx.trim())) {\r\n");
      out.write("// 		   	   		msg = '<li class=\"me\">';\r\n");
      out.write("// 			   	   	msg +=       '<span class=\"item\">'+ chatInput.val() +'</span><br>';\r\n");
      out.write("// 				    msg +=       '<span class=\"date\">'+ currentTime.toLocaleTimeString() +'</span>';\r\n");
      out.write("				} else {\r\n");
      out.write("					msg += '<li class=\"other\">';\r\n");
      out.write("				    msg +=       '<span class=\"name\">' + jsonData.name + '</span>';\r\n");
      out.write("				    msg +=       '<span class=\"item\">' + jsonData.message + '</span>';\r\n");
      out.write("				    msg +=       '<span class=\"date\">' + jsonData.date + '</span>';\r\n");
      out.write("				}\r\n");
      out.write("			    msg +=    '</li>';\r\n");
      out.write("			    console.log(msg)\r\n");
      out.write("	    		$('.contents ul').append(msg);\r\n");
      out.write("	    		lastMsgPrint(roomNumber, $('[name=\"' + roomNumber + '\"] .last-msg'));\r\n");
      out.write("   	            contents.scrollTop = 9999;\r\n");
      out.write("   	        };\r\n");
      out.write("   	    }\r\n");
      out.write("\r\n");
      out.write("   	    webSocket.onerror = function showErrorMsg(event) {\r\n");
      out.write("   	        alert(\"오류 : \" + event.data);\r\n");
      out.write("   	    }\r\n");
      out.write("   	    \r\n");
      out.write("	    webSocket.onclose = function(event){\r\n");
      out.write("			console.log(event);\r\n");
      out.write("	    	contents.value = \"\";\r\n");
      out.write("	        chatInput.value = \"\";\r\n");
      out.write("	    }\r\n");
      out.write("   	}\r\n");
      out.write("\r\n");
      out.write("   	// 메시지 구조  {\"command\" : \"명령종류\", \"room\" : \"채팅방이름\", \"message\" : \"메시지\" }\r\n");
      out.write("   	// 명령 종류 : \"create\" - 채팅방 만들기, \"change\" - 채팅방 이동, \"message\" - 메시지 전송, \"connect\" - 처음 접속\r\n");
      out.write("\r\n");
      out.write("   	//메시지 보내기\r\n");
      out.write("   	function sendMessage() {\r\n");
      out.write("   		if (chatInput.value.trim() == \"\") {\r\n");
      out.write("   	        chatInput.focus();\r\n");
      out.write("   	        return;\r\n");
      out.write("   	    }\r\n");
      out.write("   		\r\n");
      out.write("   	    var room = roomNumber\r\n");
      out.write("   	    const resultStr = chatInput.value.replaceAll('\"', '\\\\\\\"');\r\n");
      out.write("   	    console.log('resultStr >> ' + resultStr);\r\n");
      out.write("   	    \r\n");
      out.write("   	    webSocket.send(createMessage(\"message\", room, (resultStr + \".\" + room)));\r\n");
      out.write("   	 	let msg = '<li class=\"me\">';\r\n");
      out.write("	   	msg +=       '<span class=\"item\">'+ resultStr +'</span><br>';\r\n");
      out.write("// 	    msg +=       '<span class=\"date\">'+ currentTime.toLocaleTimeString() +'</span>';\r\n");
      out.write("	    msg +=       '<span class=\"date\">'+ new Date().toISOString().split(\"T\")[0] + ' ' + new Date().toTimeString().split(\" \")[0] +'</span>';\r\n");
      out.write("// 	    msg +=       '<span class=\"date\">'+ formatDate(date) +'</span>';\r\n");
      out.write("	    msg += '</li>';\r\n");
      out.write("	    $('.contents ul').append(msg);\r\n");
      out.write("	    chatInput.value = \"\";\r\n");
      out.write("	    \r\n");
      out.write("	    lastMsgPrint(room, $('[name=\"' + room + '\"] .last-msg'));\r\n");
      out.write("	    \r\n");
      out.write("	    const _data = {\r\n");
      out.write("	    	room_idx : roomNumber,\r\n");
      out.write("	    	msg : resultStr,\r\n");
      out.write("	    	mem_idx : \"");
      out.print(member_idx);
      out.write("\"\r\n");
      out.write("	    }\r\n");
      out.write("	    \r\n");
      out.write("	    $.ajax({\r\n");
      out.write("	    	url: '/chat?cmd=saveMsg.Do',\r\n");
      out.write("	    	data : _data,\r\n");
      out.write("	    	success: function(res) {\r\n");
      out.write("	    		if(res.trim() === 'false') {\r\n");
      out.write("	    			alert('뭔가 알 수 없는 오류로 실패')\r\n");
      out.write("	    		}\r\n");
      out.write("	    	},\r\n");
      out.write("	    	error: function(e) {\r\n");
      out.write("	    		console.log(e)\r\n");
      out.write("	    	}\r\n");
      out.write("	    })\r\n");
      out.write("   	}\r\n");
      out.write("\r\n");
      out.write("   	// 채팅방 이동\r\n");
      out.write("   	function chatRoomIn(roomNumber){\r\n");
      out.write("//    	    var selectRoom = document.querySelector(\".chat-list-item\");\r\n");
      out.write("//    	    if(selectRoom.selectedIndex==-1 || selectRoom.value==\"\"){\r\n");
      out.write("//    	        alert(\"이동할 채팅방을 선택한 후 사용하세요.\");\r\n");
      out.write("//    	        return;\r\n");
      out.write("//    	    }\r\n");
      out.write("// 		console.log(selectRoom.value)\r\n");
      out.write("		console.log('changeevent: '+roomNumber)\r\n");
      out.write("   	    webSocket.send( createMessage(\"change\", roomNumber, null) );			\r\n");
      out.write("   	}   	\r\n");
      out.write("   	\r\n");
      out.write("   	// 전송할 메시지를 작성하는 함수\r\n");
      out.write("   	function createMessage(command, room, message) {\r\n");
      out.write("   	    return '{\"command\" : \"' + command + '\", \"room\" : \"' + room + '\", \"message\" : \"' + message + '\"}'\r\n");
      out.write("   	}\r\n");
      out.write("\r\n");
      out.write("   	// 엔터키\r\n");
      out.write("   	function enterKey() {\r\n");
      out.write("   	    if (window.event.keyCode == 13) {\r\n");
      out.write("   	        sendMessage();\r\n");
      out.write("   	    }\r\n");
      out.write("   	}\r\n");
      out.write("   	\r\n");
      out.write("   	// layer-pop-up\r\n");
      out.write("   	$('.list form > button').on('click', function() {\r\n");
      out.write("   	  $('.layer-wrap').removeClass('hidden')\r\n");
      out.write("   	})\r\n");
      out.write("\r\n");
      out.write("   	$('.layer-wrap').on('click', function(e) {\r\n");
      out.write("   	  if(e.target.classList[0] === 'layer-wrap') {\r\n");
      out.write("   	    $('.layer-wrap').addClass('hidden')\r\n");
      out.write("   	  }\r\n");
      out.write("   	})\r\n");
      out.write("   	\r\n");
      out.write("   	$('#create-room-btn').on('click', function(){\r\n");
      out.write("   		const frm = $('#pop-up-frm').serializeArray()\r\n");
      out.write("   		const _data = JSON.stringify(frm)\r\n");
      out.write("   		$.ajax({\r\n");
      out.write("    	  url: '/chat?cmd=createRoom',\r\n");
      out.write("    	  data: {\r\n");
      out.write("    		  json:_data\r\n");
      out.write("    	  },\r\n");
      out.write("    	  success: function(res) {\r\n");
      out.write("    		  if(res.roomNumber !== -1) {\r\n");
      out.write("    			  const room = res.roomNumber\r\n");
      out.write("    			  const name = res.name\r\n");
      out.write("    			  \r\n");
      out.write("    			  let code = '<li class=\"chat-list-item\" name=\"' + room + '\" onclick=\"chatRoomIn(' + room + ')\">';\r\n");
      out.write("				  code += '<span name=\"' + room + '\">- ' + name + '</span>';\r\n");
      out.write("				  code += '<span name=\"' + room + '\" class=\"last-msg\"></span></li>';\r\n");
      out.write("    			  $('.list > ul').append(code);\r\n");
      out.write("    			  $(\"input:checkbox[id='member-check']\").prop(\"checked\", false);\r\n");
      out.write("    			  $('.layer-wrap').addClass('hidden');\r\n");
      out.write("    		  } else {\r\n");
      out.write("    			  alert('서버에서 오류가 터졌을껄? 빨리 고쳐라 노예야..!!')\r\n");
      out.write("    		  }\r\n");
      out.write("    	  },\r\n");
      out.write("    	  error: function(e) {\r\n");
      out.write("    		  console.log(e)\r\n");
      out.write("    	  },\r\n");
      out.write("    	  dataType: 'JSON'\r\n");
      out.write("      })\r\n");
      out.write("   	});\r\n");
      out.write("   	\r\n");
      out.write("   	function lastMsgPrint(roomNum, el) {\r\n");
      out.write("   		$.ajax({\r\n");
      out.write("   			url: '/chat?cmd=getLastestChat',\r\n");
      out.write("   			data: {\r\n");
      out.write("   				\"roomNum\" : roomNum\r\n");
      out.write("   			},\r\n");
      out.write("   			success: function(res) {\r\n");
      out.write("   				const lastMsg = res.trim();\r\n");
      out.write("   				el[0].innerHTML = lastMsg;\r\n");
      out.write("   			},\r\n");
      out.write("   			error: function(e) {\r\n");
      out.write("   				console.log(e)\r\n");
      out.write("   			}\r\n");
      out.write("   		})\r\n");
      out.write("   	}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
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