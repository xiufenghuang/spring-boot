package top.xiufenghuang.test;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.LoggerFactory;
public class LogTest {
    public static final Logger LOGGER = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        LOGGER.trace("Trace 日志...");
        LOGGER.debug("Debug 日志...");
        LOGGER.info("Info 日志...");
        LOGGER.warn("Warn 日志...");
        LOGGER.error("Error 日志...");
    }
}