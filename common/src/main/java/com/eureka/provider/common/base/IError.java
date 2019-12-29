package com.eureka.provider.common.base;

public interface IError {
    IError.DefaultErrorEnum UN_KNOW_ERROR = IError.DefaultErrorEnum.UN_KNOW_ERROR;
    String getMsg();

    String getErrCode();

    public static enum DefaultErrorEnum implements IError {
        UN_KNOW_ERROR("0", "未知错误")
        ;
        private String errCode;
        private String msg;

        private DefaultErrorEnum(String errCode, String msg) {
            this.errCode = errCode;
            this.msg = msg;
        }

        public String getMsg() {
            return this.msg;
        }

        public String getErrCode() {
            return this.errCode;
        }
    }
}
