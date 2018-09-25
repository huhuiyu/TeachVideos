package top.huhuiyu.springboot.projects.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class JsonMessage implements Serializable {
  private static final long serialVersionUID = 8823355291602843181L;
  public static final BigDecimal ZERO = new BigDecimal("0");
  private boolean success = false;
  private int code = 500;
  private String message = "服务器忙，请稍后重试";
  private Map<String, Object> datas = new HashMap<String, Object>();

  public JsonMessage() {
  }

  public static boolean isEmpty(String str) {
    return (str == null) || (str.trim().equals(""));
  }

  public void putData(String key, Object data) {
    datas.put(key, data);
  }

  public void removeAllData() {
    datas.clear();
  }

  public static JsonMessage getFail(String message) {
    return getMessage(false, 500, message);
  }

  public static JsonMessage getSuccess(String message) {
    return getMessage(true, 200, message);
  }

  public static JsonMessage getMessage(boolean success, int code, String message) {
    JsonMessage json = new JsonMessage();
    json.setSuccess(success);
    json.setCode(code);
    json.setMessage(message);
    return json;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Map<String, Object> getDatas() {
    return datas;
  }

  @Override
  public String toString() {
    return "JsonMessage [code=" + code + ", message=" + message + ", datas=" + datas + "]";
  }
  
}
