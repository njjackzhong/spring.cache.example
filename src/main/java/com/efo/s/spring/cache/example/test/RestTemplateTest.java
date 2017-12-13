package com.efo.s.spring.cache.example.test;

import com.alibaba.fastjson.JSONObject;
import com.efo.s.spring.cache.example.entities.JudgeRequest;
import com.efo.s.spring.cache.example.entities.JudgeResponse;
import com.efo.s.spring.cache.example.entities.RealTimeMessage;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 2017/12/7
 * Created by JackLee.
 */
@RestController
public class RestTemplateTest {

    public static void main (String[] args) {
        RestTemplate restTemplate = new RestTemplate();


        JudgeRequest realTimeEventMsg = new JudgeRequest(new RealTimeMessage("2017-11-22 11:30:11","clue"),"msgkind='clue'");



        JudgeResponse judgeResponse = restTemplate.postForObject("http://localhost:12345/judge",realTimeEventMsg,JudgeResponse.class);




        System.out.println(JSONObject.toJSONString(judgeResponse,true));

    }

}
