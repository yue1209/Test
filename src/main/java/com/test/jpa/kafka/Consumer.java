package com.test.jpa.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Consumer
 * @Author yue
 * @Date 2018/8/29 : 14:30
 **/
@Component
public class Consumer {

    @KafkaListener(topics = "java_test1")
    public void listener (ConsumerRecord<?, ?> record) throws Exception {
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }


}
