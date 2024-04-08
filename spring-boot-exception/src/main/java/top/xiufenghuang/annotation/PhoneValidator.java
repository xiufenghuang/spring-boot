package top.xiufenghuang.annotation;

import freemarker.template.utility.StringUtil;
import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/4/8 14:57
 */
public class PhoneValidator implements ConstraintValidator<Phone, String> {

    // 手机号正则表达式
    private static final String REGEX_PHONE = "^1[3456789]\\d{9}$";

    @Override
    public void initialize(Phone phone) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(value)) {
            // 忽略空值，由@NotBlank注解校验
            return true;
        }
        return Pattern.matches(REGEX_PHONE, value);
    }

}