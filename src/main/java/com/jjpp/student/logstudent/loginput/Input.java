package com.jjpp.student.logstudent.loginput;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljpeng.
 * @Description
 * @create 2021/1/15 10:53
 */
@RestController()
@Slf4j
public class Input {

    @GetMapping("/bless")
    public String bless(){
        log.info("新年快乐！");
        log.info("恭喜发财！");
        return "ok";
    }
}
