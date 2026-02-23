package com.astik.reddis.redistut.scheduler;

import com.astik.reddis.redistut.service.EmailService;
import com.astik.reddis.redistut.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MailScheduler {

    @Autowired
    private EmailService emailService;

    @Autowired
    private ProductService productService;

    //@Scheduled(cron = "0 0 6 * * ?")
    //@Scheduled(cron = "0 */2 * * * ?")
    public void sendMorningMail() {
        emailService.sendMail();
        System.out.println("Mail sent at 6 AM");
    }
    @Scheduled(cron = "0 */1 * * * ?")
    public void sendProductOnMail()
    {
        productService.sendAllProductsOnMail();
    }
}
