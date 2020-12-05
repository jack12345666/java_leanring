package com.wang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class AsynctaskApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("test 主题!");
        mailMessage.setText("hello world!");

        mailMessage.setTo("2726653264@qq.com");
        mailMessage.setFrom("2726653264@qq.com");
        mailSender.send(mailMessage);
    }

    @Test
    void setComplexMail() throws MessagingException {
        // 一个复杂邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        // 正文
        helper.setSubject("jack你好呀~");
        helper.setText("<h3 style='color: red'>hello world</h3>", true);

        // 附件
        helper.addAttachment("girl.jpg", new File("C:\\Users\\Administrator\\Desktop\\girl.jpg"));

        helper.setTo("2726653264@qq.com");
        helper.setFrom("2726653264@qq.com");
        mailSender.send(mimeMessage);
    }

}
