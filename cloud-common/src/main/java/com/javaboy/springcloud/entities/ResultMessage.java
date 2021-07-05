package com.javaboy.springcloud.entities;

/**
 * @author javaboy
 */
public class ResultMessage {

    private int code;
    private String msg;
    private Object data;

    public ResultMessage() {
    }

    public ResultMessage(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultMessage success(Object data){
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setCode(100);
        resultMessage.setMsg("success");
        resultMessage.setData(data);
        return resultMessage;
    }


    public static ResultMessage fail(){
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setCode(200);
        resultMessage.setMsg("fail");
        return resultMessage;
    }

    public static ResultMessage fail(Object data){
        ResultMessage resultMessage = new ResultMessage();
        resultMessage.setCode(200);
        resultMessage.setMsg("fail");
        resultMessage.setData(data);
        return resultMessage;
    }

}
