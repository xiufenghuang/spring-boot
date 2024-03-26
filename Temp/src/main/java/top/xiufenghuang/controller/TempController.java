

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xiufenghuang.entity.Article;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/template")
public class TempController {

    @GetMapping("/freemarker")
    public String freemarkerIndex(Model model) {
        List<Article> articles = Arrays.asList(
                new Article(1, "张三", "Java")
                , new Article(2, "张三丰", "Spring")
                , new Article(3, "张三风", "Spring Boot")
        );
        model.addAttribute("articles", articles);
        System.out.println(articles);
        //模版名称，实际的目录为：resources/template/freemarker-demo.ftl
        return "freemarker-demo";
    }
}