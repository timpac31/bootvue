package io.timpac.bootvue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    String hello() {
        System.out.println("hello");
        return "vue/index";
    }
}
