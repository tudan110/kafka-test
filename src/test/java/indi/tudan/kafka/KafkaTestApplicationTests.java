package indi.tudan.kafka;

import indi.tudan.kafka.kafka.KafkaProducer;
import indi.tudan.kafka.utils.SpringBeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KafkaTestApplication.class})
public class KafkaTestApplicationTests {

    @Test
    public void testSend() {

        KafkaProducer kafkaProducer = SpringBeanUtils.getBean(KafkaProducer.class);

        for (int i = 0; i < 5; i++) {
            //kafkaProducer.sendMessage0("csbo_index_data", getMessage1());
            //if (kafkaProducer.sendMessage("csbo_index_data", getMessage())) {
            if (kafkaProducer.sendMessage("csbo_index_data", getMessage1())) {
                log.info("发送成功。");
            } else {
                log.info("发送失败。");
            }
        }
    }

    private String getMessage() {

        return "{\n" +
                "\t\"dataType\": \"12\",\n" +
                "\t\"endTime\": \"2019-12-18 09:30:00\",\n" +
                "\t\"indexDataList\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"areaCode\": 8130000,\n" +
                "\t\t\t\"attrList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_TYPE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656887249\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"1\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239908,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_NAME\",\n" +
                "\t\t\t\t\t\"featureCd\": \"1\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"集团直充\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 1,\n" +
                "\t\t\t\t\t\"indexResultId\": 1,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157876387200\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"7764459\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239909,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656888468\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"1810.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239910,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158911241790\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"7754659\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239911,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656817202\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"1802.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239912,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158931047207\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"9800\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239913,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158942643210\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"8.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239914,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"RECHARGE_SUCC_RATE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157674360197\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"99.55801104972376\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239915,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"indexResultId\": 3880239276,\n" +
                "\t\t\t\"indexValue\": \"99.56\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"areaCode\": 8130000,\n" +
                "\t\t\t\"attrList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_TYPE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656887249\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"2\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239916,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_NAME\",\n" +
                "\t\t\t\t\t\"featureCd\": \"1\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"省内充值中心\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 1,\n" +
                "\t\t\t\t\t\"indexResultId\": 1,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157876387200\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"1436052\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239917,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656888468\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"300.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239918,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158911241790\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"1436052\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239919,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656817202\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"300.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239920,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158931047207\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239921,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158942643210\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239922,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"RECHARGE_SUCC_RATE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157674360197\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"100.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239923,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"indexResultId\": 3880239277,\n" +
                "\t\t\t\"indexValue\": \"100\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"areaCode\": 8130000,\n" +
                "\t\t\t\"attrList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_TYPE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656887249\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"3\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239924,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_NAME\",\n" +
                "\t\t\t\t\t\"featureCd\": \"1\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"营业厅缴费\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 1,\n" +
                "\t\t\t\t\t\"indexResultId\": 1,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157876387200\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"18314850\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239925,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656888468\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"833.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239926,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158911241790\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239927,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656817202\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239928,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158931047207\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239929,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158942643210\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239930,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"RECHARGE_SUCC_RATE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157674360197\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239931,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"indexResultId\": 3880239278,\n" +
                "\t\t\t\"indexValue\": \"0\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"areaCode\": 8130000,\n" +
                "\t\t\t\"attrList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_TYPE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656887249\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239932,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"BUSI_NAME\",\n" +
                "\t\t\t\t\t\"featureCd\": \"1\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"全部渠道缴费\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 1,\n" +
                "\t\t\t\t\t\"indexResultId\": 1,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157876387200\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"27515361\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239933,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUM_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656888468\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"2943.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239934,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158911241790\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239935,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"SUCC_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157656817202\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239936,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_FEE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158931047207\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239937,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"FAIL_COUNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158942643210\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239938,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"RECHARGE_SUCC_RATE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157674360197\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"0.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 3880239939,\n" +
                "\t\t\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"indexResultId\": 3880239279,\n" +
                "\t\t\t\"indexValue\": \"0\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"indexId\": 565132054566,\n" +
                "\t\"indexStatCycleCd\": \"5003\",\n" +
                "\t\"netObjId\": 0,\n" +
                "\t\"resourceId\": 0,\n" +
                "\t\"servTreeObjId\": 157656984171,\n" +
                "\t\"sourceSystem\": 0,\n" +
                "\t\"startTime\": \"2019-12-18 09:15:00\",\n" +
                "\t\"timeStamp\": \"2019-12-18 09:30:31\"\n" +
                "}";
    }

    private String getMessage1() {
        return "{\n" +
                "\t\"dataType\": \"12\",\n" +
                "\t\"endTime\": \"2020-03-24 14:00:00\",\n" +
                "\t\"indexDataList\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"areaCode\": 8130000,\n" +
                "\t\t\t\"attrList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"CNT\",\n" +
                "\t\t\t\t\t\"featureCd\": \"157574221970\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"4.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 83129902729,\n" +
                "\t\t\t\t\t\"indexResultId\": 83129902627,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"indexResultId\": 83129902627,\n" +
                "\t\t\t\"indexValue\": \"4\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"indexId\": 157551688200,\n" +
                "\t\"indexStatCycleCd\": \"5001\",\n" +
                "\t\"netObjId\": 0,\n" +
                "\t\"resourceId\": 0,\n" +
                "\t\"servTreeObjId\": 517370946383,\n" +
                "\t\"sourceSystem\": 0,\n" +
                "\t\"startTime\": \"2020-03-24 13:55:00\",\n" +
                "\t\"timeStamp\": \"2020-03-24 14:00:13\"\n" +
                "}";
    }

}
