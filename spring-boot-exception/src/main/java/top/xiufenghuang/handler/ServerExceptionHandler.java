package top.xiufenghuang.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.xiufenghuang.exception.ServerException;
import top.xiufenghuang.result.Result;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:31
 * @author hxf13
 */
@Slf4j
@RestControllerAdvice
public class ServerExceptionHandler {
    //处理自定义异常
    @ExceptionHandler(value = ServerException.class)
    public Result<?> handlerServerException(ServerException e){
        return Result.error(e.getCode(),e.getMsg());
    }
    @ExceptionHandler(value = Exception.class)
    public Result<?> handlerServerException(Exception e){
        return Result.error(e.getMessage());
    }

}