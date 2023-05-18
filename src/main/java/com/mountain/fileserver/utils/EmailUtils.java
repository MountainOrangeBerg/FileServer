package com.mountain.fileserver.utils;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Calendar;
import java.util.Properties;

public class EmailUtils {

    public static void send(StringBuffer stringBuffer, String email) {

        //创建一个配置文件并保存
        Properties properties = new Properties();

        properties.setProperty("mail.host", "smtp.exmail.qq.com");

        properties.setProperty("mail.transport.protocol", "smtp");

        properties.setProperty("mail.smtp.auth", "true");

        Transport transport = null;
        //QQ存在一个特性设置SSL加密
        try {


            MailSSLSocketFactory sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);

            //创建一个session对象
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("kaoqin@miniso.com", "Aa789789");
                }
            });

            //开启debug模式
            session.setDebug(true);

            //获取连接对象
            transport = session.getTransport();

            //连接服务器
            transport.connect("smtp.exmail.qq.com", "kaoqin@miniso.com", "Aa789789");

            //创建邮件对象
            MimeMessage mimeMessage = new MimeMessage(session);

            //邮件发送人
            mimeMessage.setFrom(new InternetAddress("kaoqin@miniso.com"));

            //邮件接收人
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(email.toString()));

            //邮件标题
            mimeMessage.setSubject("月考勤数据核对提醒");

            //邮件内容
            mimeMessage.setContent(stringBuffer.toString(), "text/html;charset=UTF-8");

            //发送邮件
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        } finally {
            try {
                transport.close();
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
        //关闭连接

    }

}
