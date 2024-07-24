package com.example.demo.model;


import org.springframework.stereotype.Service;

import java.io.Serializable;



@Service


public class ApiResult implements Serializable {

    private Integer code;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object error;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    private ApiResult() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ApiResult success(Object data) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(ApiResultCode.SUCCESS.getCode());
        apiResult.setData(data);
        return apiResult;
    }

    public static Boolean isSuccess(ApiResult apiResult) {
        return apiResult.getCode() == ApiResultCode.SUCCESS.getCode();
    }

    public static ApiResult failure(ApiResultCode result) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(result.getCode());
        apiResult.setErrorMessage(result.getErrorMessage());
        return apiResult;
    }

    public static ApiResult failure(ApiResultCode result, String errorMessage) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(result.getCode());
        apiResult.setErrorMessage(errorMessage);
        return apiResult;
    }

    public static ApiResult failure(String errorMessage) {

        ApiResult apiResult = new ApiResult();
        apiResult.setCode(ApiResultCode.ERROR.getCode());
        apiResult.setErrorMessage(errorMessage);
        return apiResult;
    }

    public static ApiResult failure(Object error) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(ApiResultCode.ERROR.getCode());
        apiResult.setError(error);
        return apiResult;
    }

    public static ApiResult failure(ApiResultCode result, Object error) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(result.getCode());
        apiResult.setError(error);
        return apiResult;
    }
}
