/*
package com.test.jpa.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

*/
/**
 * @ClassName Producer
 * @Author yue
 * @Date 2018/8/29 : 14:30
 **//*

@RestController
public class Producer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    */
/**
     * 发送消息到kafka
     *
     * @param msg
     * @return
     *//*

    @RequestMapping("send")
    public String send(String msg) {
        kafkaTemplate.send("java_test1", msg);
        return "success";
    }

    */
/**
     * 获取消息
     *//*

    @RequestMapping("delkfk")
    public String deletekfk() {
        kafkaTemplate.flush();
        return "success";
    }
}
*/
