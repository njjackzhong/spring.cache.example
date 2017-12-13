package com.efo.s.spring.cache.example.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2017/12/13
 * Created by JackLee.
 */
@Component
public class ClueMessageProducer {

    private Log log = LogFactory.getLog(ClueMessageProducer.class);


    //ExecutorService service = Executors.newCachedThreadPool();
    private List<Integer> clueMessages = new ArrayList<>();

    private final Integer MAX_CLUE_MESSAGE_COUNT = 100;

    public ClueMessageProducer(){
        for(int i=0;i<MAX_CLUE_MESSAGE_COUNT;i++){
            clueMessages.add(i);
        }
    }



    @Scheduled(fixedDelay = 1000)
    public void getAllClueMessagesFromPostgresDatabaseToLocalCache() {
        log.info("Getting Clue Messages From Postgres Database To Local Cache....");

        clueMessages.parallelStream().forEach(this::getSingleClueMessagesFromPostgresDatabaseToLocalCache);
//        clueMessages.forEach(this::getSingleClueMessagesFromPostgresDatabaseToLocalCache);
    }

    private void getSingleClueMessagesFromPostgresDatabaseToLocalCache(Integer index){
        log.info(String.format("\tGetting Single Clue Message(index=%5s) From Postgres Database To Local Cache....",index));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
