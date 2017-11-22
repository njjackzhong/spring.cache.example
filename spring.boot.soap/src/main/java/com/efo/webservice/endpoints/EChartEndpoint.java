package com.efo.webservice.endpoints;

import com.efo.webservice.echart.GetEchartRequest;
import com.efo.webservice.echart.GetEchartResponse;
import com.efo.webservice.repository.EchartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * 2017/11/22
 * Created by JackLee.
 */
@Endpoint
public class EChartEndpoint {

    private static final String NAMESPACE_URI ="http://webservice.efo.com/echart";

    private final EchartService echartService;

    @Autowired
    public EChartEndpoint(EchartService echartService){

        this.echartService = echartService;
    }


    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getEchartRequest")
    @ResponsePayload
    public GetEchartResponse getChart(@RequestPayload GetEchartRequest request){
        GetEchartResponse response = new GetEchartResponse();
        response.setEhart(echartService.getEChart(request.getId()));

        return response;
    }

}
