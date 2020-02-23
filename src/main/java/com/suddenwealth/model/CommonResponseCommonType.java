package com.suddenwealth.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yxd on 2020/1/9.
 */
public class CommonResponseCommonType {
    @ApiModelProperty(value="接口调用成功标志 boolean类型",required = true, position = 1,example = "true")
    private boolean succeed = false;
    @ApiModelProperty(value="接口调用响应描述", position = 3,example = "成功")
    private String responseMessage = "";
    @ApiModelProperty(value="接口调用响应code",required = true, position = 2,example = "0000")
    private String responseCode = "";
    @ApiModelProperty(value="接口调用警示信息", position = 4,example = "")
    private String warningMessage = "";

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
}
