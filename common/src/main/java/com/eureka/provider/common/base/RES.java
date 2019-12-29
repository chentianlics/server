package com.eureka.provider.common.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.beans.Transient;
import java.util.Objects;
@Data
public class RES<T> {
    public static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    public static final String DEFAULT_ERROR_MESSAGE = "FAIL";
    public static final String DEFAULT_SUCCESS_CODE = "1";
    public static final String DEFAULT_ERROR_CODE = "0";
    private String code;//请求code，表示请求层面，0失败；1成功
    private String resCode;//资源code，表示业务层面成功或失败，0失败，1成功
    private String errCode = "0";//失败code，0表示默认
    private String msg;
    private T data;

    public RES() {
    }

    public static <T> RES<T> ok(T t) {
        RES<T> res = new RES();
        res.setCode("1");
        res.setResCode("1");
        res.setMsg("OK");
        res.setData(t);
        return res;
    }

    public static <T> RES<T> ok() {
        RES<T> res = new RES();
        res.setCode("1");
        res.setResCode("1");
        res.setMsg("OK");
        res.setData((T) null);
        return res;
    }

    public static <T> RES<T> fail(IError error) {
        RES<T> res = new RES();
        res.setCode("0");
        res.setResCode("0");
        res.setErrCode(error.getErrCode());
        res.setMsg(error.getMsg());
        res.setData((T)null);
        return res;
    }

    public static <T> RES<T> fail(String msg) {
        RES<T> res = new RES();
        res.setCode("0");
        res.setResCode("0");
        res.setErrCode(IError.UN_KNOW_ERROR.getErrCode());
        res.setMsg(msg);
        res.setData((T)null);
        return res;
    }

    public static <T> RES<T> fail(IError error, String msg) {
        RES<T> res = new RES();
        res.setCode("0");
        res.setResCode("0");
        res.setErrCode(error.getErrCode());
        res.setMsg(msg);
        res.setData((T)null);
        return res;
    }
}