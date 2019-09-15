package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

    /*
     * 根据年龄查询女生信息
     */
    public List<Girl> findByAge(Integer age);
}
