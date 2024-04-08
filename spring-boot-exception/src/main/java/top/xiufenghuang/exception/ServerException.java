package top.xiufenghuang.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import top.xiufenghuang.enums.ErrorCode;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:02
 * @author hxf13
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class ServerException extends RuntimeException{
    private final int code;
    private final String msg;
    public  ServerException(String msg){
        this.code = ErrorCode.INTERNAL_SERVER_ERROR.getCode();
        this.msg=msg;
    }
    public  ServerException(ErrorCode errorCode){
      this.code= errorCode.getCode();
      this.msg =errorCode.getMsg();
    }
}