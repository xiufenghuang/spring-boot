package top.xiufenghuang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/3/26 14:18
 */
@Configuration
public class DataSourceConfig {
  /*  这个错误表明Spring Boot应用程序尝试配置数据源时遇到了问题。具体地说，它指出没有指定 'url' 属性，并且也没有配置嵌入式数据源。

    通常情况下，Spring Boot会尝试根据应用程序的配置自动配置数据源。但是在你的情况下，由于没有提供足够的信息，Spring Boot 无法确定适合的驱动程序类。

    根据错误信息中的 ，你可能已经排除了自动配置数据源的功能。这通常是在某些情况下，你想要自己手动配置数据源时所采取的做法。@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

    要解决这个问题，你需要手动配置数据源，并确保提供了必要的属性，如 'url'、'username'、'password' 和驱动程序类。以下是一个可能的配置示例：

    java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

    @Configuration
    public class DataSourceConfig {

        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/your_database");
            dataSource.setUsername("your_username");
            dataSource.setPassword("your_password");
            return dataSource;
        }
    }
    在这个配置类中，我们手动配置了一个数据源，指定了MySQL数据库的URL、用户名和密码，以及MySQL驱动程序的类名。

    确保在你的应用程序中使用类似的配置，并且提供了正确的数据库连接信息。这样就能解决数据源配置失败的问题。
*/
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_boot");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
}