package com.astik.reddis.redistut.service;

import com.astik.reddis.redistut.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("yadavastik2004@gmail.com");
        message.setSubject("Morning Mail");
        message.setText("Good Morning! This is your scheduled email.");
        mailSender.send(message);
        System.out.println(message);
    }

    public void sendProductListEmail(List<Product> products) {

        StringBuilder body = new StringBuilder();
        body.append("Product List:\n\n");

        for (Product p : products) {
            body.append("ID: ").append(p.getId()).append("\n");
            body.append("Name: ").append(p.getName()).append("\n");
            body.append("Description: ").append(p.getDescription()).append("\n");
            body.append("Price: ").append(p.getPrice()).append("\n");
            body.append("----------------------\n");
        }

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("yadavastik2004@gmail.com");
        message.setSubject("All Products List");
        message.setText(body.toString());

        mailSender.send(message);
    }
}
