package top.xiufenghuang.Server;

import org.springframework.stereotype.Service;
import top.xiufenghuang.enums.ErrorCode;
import top.xiufenghuang.exception.ServerException;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:16
 */
@Service
public class MyServer {
     public void unAuthorizedError(){

         throw new ServerException(ErrorCode.UNAUTHORIZED);
     }
     public  void serverError(){
         throw new ServerException(ErrorCode.INTERNAL_SERVER_ERROR);

     }

}