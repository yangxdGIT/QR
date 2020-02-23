package com.suddenwealth.model;

import lombok.Data;

/**
 * Created by yxd on 2020/1/14.
 */
@Data
public class CommonResponse {

    private Object data;

    private boolean succeed;

    private String respCode;

    private String respMessage;

}
