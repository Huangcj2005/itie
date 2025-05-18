package csu.itie.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.io.Serializable;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;

    private CommonResponse(int status){
        this.status = status;
    }
    private CommonResponse(int status,String msg){
        this.status = status;
        this.msg = msg;
    }
    private CommonResponse(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    private CommonResponse(int status,T data){
        this.status = status;
        this.data = data;
    }


    @JsonIgnore
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    // 成功 返回码
    public static <T> CommonResponse <T> createForSuccess(){
        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    // 成功 返回码与数据
    public static <T> CommonResponse <T> createForSuccess(T data){
        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    // 成功 返回码与提示信息
    public static <T> CommonResponse <T> createForSuccessMessage(String msg){
        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> CommonResponse <T> createForSuccessMessage(int code,String msg){
        return new CommonResponse<T>(code,msg);
    }

    // 成功 返回码、提示信息与数据
    public static <T> CommonResponse <T> createForSuccess(String msg,T data){
        return new CommonResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    public static <T> CommonResponse<T> createForError(){
        return new CommonResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDescription());
    }

    // 自己指定错误信息
    public static <T> CommonResponse<T> createForError(String msg){
        return new CommonResponse<T>(ResponseCode.ERROR.getCode(),msg);
    }

    // 自己指定错误信息与错误码
    public static <T> CommonResponse<T> createForError(int code,String msg){
        return new CommonResponse<T>(code,msg);
    }

}
