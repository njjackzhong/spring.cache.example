package com.efo.s.spring.cache.example.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 2017/12/13
 * Created by JackLee.
 */
@Component
public class ClueMessageConsumer {

    private Log log = LogFactory.getLog(ClueMessageConsumer.class);

    @Scheduled(fixedDelay = 100)
    public void sendClueMessagesFromLocalCacheToRabbitMQ(){
        log.info("Sending Clue Messages From Local Cache To RabbitMQ....");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
