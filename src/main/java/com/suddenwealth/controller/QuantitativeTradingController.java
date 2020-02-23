package com.suddenwealth.controller;


import com.suddenwealth.model.CommonDataResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yxd on 2020/1/2.
 */
@RestController
public class QuantitativeTradingController {

    @PostMapping(value ="/quantitativeTrading/test")
    public CommonDataResponse test() throws Exception{

        return null;
    }

}
