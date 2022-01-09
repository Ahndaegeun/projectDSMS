package util;

import java.util.HashMap;

import org.apache.catalina.ha.tcp.SendMessageData;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API
 *        PHP
 */
public class MessageUtil {
	private static MessageUtil instance;
	private String api_key = "NCSC9SS3LVHL7V8K";
	private String api_secret = "B6T3LXOC1QM8OOWEGITFHZYJAYU8TFCF";
	private Message coolsms = new Message(api_key, api_secret);

	private MessageUtil() {}
	
	public static MessageUtil getInstance() {
		if(instance == null) {
			instance = new MessageUtil();
		}
		return instance;
	}
	
	public boolean sendMessage(String userPhone, String text) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", userPhone);
		params.put("from", "01031210046");
		params.put("type", "SMS");
		params.put("text", text);
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			coolsms.send(params);
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "선물이 도착했습니다! 카톡 선물코드를 등록하여 선물을 받아보세요.\n"
				+ "∙ 선물코드 : PLZ4FJDSMM\n"
				+ "∙ 등록 URL : http://kko.to/SDtOT8cfT"
				+ "=======당신의 마니또=======";
		
//		boolean result = MessageUtil.getInstance().sendMessage("01098956648", str);
		boolean result = MessageUtil.getInstance().sendMessage("01040634264", str);
		System.out.println(result);
	}
}