package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    /*
     * 查询所有女生
     */
    @RequestMapping(value = "/girls",method = RequestMethod.GET)
    public List<Girl> girlList(){
        return this.girlRepository.findAll();
    }

    /*
     * 添加一个女生
     */
    @RequestMapping(value = "/girls",method = RequestMethod.POST)
    public Girl addGirl(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age){

        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);

        this.girlRepository.save(girl);
        return  girl;
    }

    /*
     * 查询指定ID的女生
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return this.girlRepository.findById(id).get();
    }

    /*
     * 更新指定ID的女生信息
     */
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id, @RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age){

        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return this.girlRepository.save(girl);
    }

    /*
     * 删除指定ID的女生
     */
    @DeleteMapping(value = "/girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id){
        this.girlRepository.deleteById(id);
    }

    /*
     * 根据年龄查询所有女生
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return this.girlRepository.findByAge(age);
    }
}
