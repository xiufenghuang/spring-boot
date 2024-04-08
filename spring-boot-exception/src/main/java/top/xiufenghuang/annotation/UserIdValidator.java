package top.xiufenghuang.annotation;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 15:39
 */
public class UserIdValidator implements ConstraintValidator<UserID,String> {

    private  static final String REGEX_PHONE ="^1[2456789]\\d{9}$";

    @Override
    public void initialize(UserID userID){

    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context){
        if(StringUtils.isBlank(value)){
            return true;
        }
        return Pattern.matches(REGEX_PHONE, value);
    }
}