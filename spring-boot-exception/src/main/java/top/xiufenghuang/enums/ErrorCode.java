package top.xiufenghuang.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNAUTHORIZED(401,"登入失效，请重新登入"),//枚举实例，外部不能实现
    INTERNAL_SERVER_ERROR(500,"服务器失常，请稍后尝试"),
    UNKNOW_ERROR(999,"未知错误");
    private final int code;
    private final String msg;


}
