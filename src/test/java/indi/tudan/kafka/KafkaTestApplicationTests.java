package indi.tudan.kafka;

import indi.tudan.kafka.kafka.KafkaProducer;
import indi.tudan.kafka.utils.SpringBeanUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KafkaTestApplication.class})
public class KafkaTestApplicationTests {

    @Test
    public void testSend() {

        KafkaProducer kafkaProducer = SpringBeanUtils.getBean(KafkaProducer.class);
        kafkaProducer.sendMessage("csbo_index_data", "{\n" +
                "    \"areaCode\": \"8330100\",\n" +
                "    \"dataType\": \"10\",\n" +
                "    \"endTime\": \"2017-05-15 19:36:28\",\n" +
                "    \"indexId\": 1003001,\n" +
                "    \"indexResultId\": 100169843,\n" +
                "    \"indexValue\": \"70.35\",\n" +
                "    \"netObjId\": 11001,\n" +
                "    \"resourceId\": 221010300,\n" +
                "    \"servTreeObjId\": 1010300,\n" +
                "    \"sourceSystem\": 10001,\n" +
                "    \"startTime\": \"2017-05-15 19:36:28\",\n" +
                "    \"timeStamp\": \"2017-05-18 18:09:45\",\n" +
                "    \"attrList\": [\n" +
                "        {\n" +
                "            \"columnName\": \"USER_ID\",\n" +
                "            \"featureCd\": \"9033\",\n" +
                "            \"featureType\": \"10\",\n" +
                "            \"featureValue\": \"353\",\n" +
                "            \"indexRestExtId\": 123,\n" +
                "            \"indexResultId\": 100169843,\n" +
                "            \"serialId\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"columnName\": \"USER_NAME\",\n" +
                "            \"featureCd\": \"9033\",\n" +
                "            \"featureType\": \"10\",\n" +
                "            \"featureValue\": \"353\",\n" +
                "            \"indexRestExtId\": 124,\n" +
                "            \"indexResultId\": 100169843,\n" +
                "            \"serialId\": 2\n" +
                "        }\n" +
                "    ]\n" +
                "}");
    }

}
