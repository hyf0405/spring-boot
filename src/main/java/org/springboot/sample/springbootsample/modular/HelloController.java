package org.springboot.sample.springbootsample.modular;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping
    public String hello(){
        return "Hello spring-boot";
    }

    @RequestMapping("/info")
    public Map<String,String> getInfo(@RequestParam String name){
        Map<String,String> param = new HashMap();
        param.put("name",name);
        return param;
    }
    @RequestMapping("/list")
    public List<Map<String,String>> getList(){
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        Map<String, String> map = null;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>();
            map.put("name", "Shanhy-" + i);
            list.add(map);
        }
        return list;
    }
}
