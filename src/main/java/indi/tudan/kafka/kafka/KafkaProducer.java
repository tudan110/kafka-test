package indi.tudan.kafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
@Component
public class KafkaProducer {

    @SuppressWarnings("rawtypes")
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @SuppressWarnings("unchecked")
    public void sendMessage0(String topic, String message) {

        log.info("send message:{}", message);
        kafkaTemplate.send(topic, message);

    }

    @SuppressWarnings("unchecked")
    public boolean sendMessage(String topic, String message) {

        log.info("send message:{}", message);

        try {

            kafkaTemplate.send(topic, message).get(5000, TimeUnit.MILLISECONDS);
            //kafkaTemplate.send(topic, message).get();
            return true;

        } catch (InterruptedException e) {

            log.error("写入kafka失败，线程中断！", e);

        } catch (ExecutionException e) {

            log.error("写入kafka失败，执行异常！", e);

        } catch (TimeoutException e) {

            log.error("写入kafka失败，写入超时！", e);

        }

        return false;
    }
}
