package com.moa.viliage.mail;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.LoggerFactory;

import com.moa.viliage.common.Utils;
import com.wistron.swpc.portalc.encrypt.PasswordEncrypter;

public class MailUtils {
	
	private static final String TAG = "MailUtils";
	
	private static Properties prop = new Properties();
	
	//moaxnr:moa59192519
	//A8E4E79508775F36249966FA1D80DC0E:09D367FF9B3ED6B932583B65B82848E1
	
	private static final String USER = "A8E4E79508775F36249966FA1D80DC0E";
	
	private static final String PSWD = "09D367FF9B3ED6B932583B65B82848E1";
	
	private static String user;
	
	private static String pswd;
	
	private static ExecutorService pool;
	
	static {
		prop.setProperty("mail.smtp.host", "smtp.163.com");
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");
        
        user = PasswordEncrypter.decrypter(USER);
        pswd = PasswordEncrypter.decrypter(PSWD);
        
        pool = Executors.newFixedThreadPool(50);
	}
	
	private static class MailSendTask implements Runnable {
		
		private String subject;
		
		private String content;
		
		private String to;
		
		private List<InternetAddress> list = new ArrayList<InternetAddress>();
		
		private MailSendTask(String to, String subject, String content) {
			this.to = to;
			this.subject = subject;
			this.content = content;
			String[] addres = to.split(";");
			for (String addr : addres) {
				if (! Utils.isEmpty("addr")) {
					try {
						list.add(new InternetAddress(addr));
					} catch (AddressException e) {
						LoggerFactory.getLogger(TAG).error("mail address error:" + addr);
						continue;
					}
				}
			}
		}
		
		
		@Override
		public void run() {
			Session session = Session.getInstance(prop);
	        Transport ts;
			try {
				//通过session得到transport对象
				ts = session.getTransport();
				//使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
				ts.connect("smtp.163.com", user, pswd);
				 //创建邮件对象
		        MimeMessage message = new MimeMessage(session);
		        //指明邮件的发件人
		        message.setFrom(new InternetAddress(user + "@163.com"));
		        //指明邮件的收件人
		        
		        if (list.size() == 0) {
		        	LoggerFactory.getLogger(TAG).error("mail address empty");
		        	return;
		        }
		        InternetAddress[] addresses = new InternetAddress[list.size()];
		        list.toArray(addresses);
		        
		        message.addRecipients(Message.RecipientType.TO, addresses);
		        //邮件的标题
		        message.setSubject(subject);
		        message.setContent(content, "text/html;charset=UTF-8");
		        ts.sendMessage(message, message.getAllRecipients());
		        ts.close();
		        LoggerFactory.getLogger(TAG).info("send mail success");
			} catch (Exception e) {
				LoggerFactory.getLogger(TAG).error("send mail error: " + e.getMessage());
			}
	        
		}
	}
	
	/**
	 * 发送贷款申请邮件
	 */
	public static final void sendSimpleMail(String to, String subject, String content) {
//		String subject = "贷款申请通知";
		if (pool == null || pool.isShutdown()) {
			pool = Executors.newFixedThreadPool(50);
		}
		pool.execute(new MailSendTask(to, subject, content));
	}
	
//	public static final void SendSimpleMail(String to, String subject, String content) throws Exception {
//		if (pool == null || pool.isShutdown()) {
//			pool = Executors.newFixedThreadPool(50);
//		}
//		pool.execute(new MailSendTask(to, subject, content));
//	}
	public static void sendInsureNotifyMail(String insureApplyId,String formerInfo){
		String[] strs = MailContentLoader.getInsureApplyContent(insureApplyId);
		if (strs == null || strs.length == 0 || Utils.isEmpty(strs[0]) || Utils.isEmpty(strs[1])) {
			return;
		}
		
		MailUtils.sendSimpleMail(strs[1], "保险申请通知（来源：农业部新农人直报平台）", strs[0] + formerInfo);
	}
}
