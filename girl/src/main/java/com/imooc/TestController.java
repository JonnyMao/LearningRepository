package com.imooc;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/hello")
public class TestController {
    @RequestMapping(value = {"/say" },method = RequestMethod.GET)
    public String say(@RequestParam(value = "id", required=false, defaultValue="0") Integer id) {
        return "id:" + id;
    }
}
