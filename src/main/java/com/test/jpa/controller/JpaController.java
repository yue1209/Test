package com.test.jpa.controller;

import com.test.jpa.Pojo.Jpa_User;
import com.test.jpa.dao.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName JpaController
 * @Author yue
 * @Date 2018/8/22 : 14:09
 **/
@RestController
public class JpaController {
    @Autowired
    JpaRepository jpa;

    @RequestMapping("/")/**/
    public String getString() {
        return "1";
    }

    /**
     * 添加---id为自增长id，在实体使用注解----@id注解必须加
     * jpa的id生成策略：https://www.cnblogs.com/xiaohouzai/p/8989378.html
     *
     * @return
     */
    @RequestMapping("/add")
    public String addJpaUser() {
        Jpa_User u = new Jpa_User();
        u.setName("2");
        u.setPass("3");
        jpa.save(u);
        return "Save Success";
    }

    @RequestMapping("/upd")
    public String updJpaUser(int id) {
        Jpa_User u = new Jpa_User();
        u.setId(id);
        u.setName("我被改了");
        u.setPass("我也被改了");
        jpa.save(u);
        return "Update Success";
    }

    /**
     * 自写sql的删除
     * 关于jpa的自写sql参考网址：https://blog.csdn.net/Amy_Queen/article/details/72454099
     *
     * @param user
     * @return
     */
    @RequestMapping("/del")
    public String del(Jpa_User user) {
        jpa.deleteById(user.getId());
        return "Delete Success";
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/all")
    public List<Jpa_User> queryAll() {
        long count = jpa.count();
        //查询全部
        List<Jpa_User> all = jpa.findAll();
        //默认排序
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        List<Jpa_User> all1 = jpa.findAll(sort);
        //模糊查询:https://blog.csdn.net/czx1204/article/details/79131281
        //多表查询：https://www.cnblogs.com/jiangxiaoyaoblog/p/5635152.html
        System.out.println(count + "=====" + all);
        return all1;
    }

    /**
     * 分页查询：https://blog.csdn.net/a772304419/article/details/79051307
     * @return
     */
    @RequestMapping("/allByPage")
    public Map<String,Object> queryAllByPage() {
        //分页查询（传入page以及rows）
        Pageable pageable = new PageRequest(2-1,2);
        Sort sort=new Sort(Sort.Direction.DESC,"id");
        Page<Jpa_User> all2 = jpa.findAll(pageable);
        //返回客户端数据需要total和rows
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("total", all2.getNumberOfElements());
        result.put("rows",all2.getContent());
//        System.out.println("1a13sssss421");

        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.MAX);
        System.out.println(timestamp+"12");
        return result;
    }
}
