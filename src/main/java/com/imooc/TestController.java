package com.imooc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by war on 2019/3/1.
 */
@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
