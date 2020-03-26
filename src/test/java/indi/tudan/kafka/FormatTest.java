package indi.tudan.kafka;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * 格式化测试
 *
 * @author wangtan
 * @date 2020-03-26 10:15:46
 * @since 1.0
 */

@Slf4j
public class FormatTest {

    public static void main(String[] args) {

        String content = getContent();

        System.out.println(JSON.parseObject(content).getString("indexId"));
        String indexId = JSON.parseObject(content).getString("indexId");
        boolean logOpen = "158270704270".equals(indexId);
        if (logOpen) {
            log.error("监控指标 indexId: {}, content: {}", indexId, content);
        }

    }

    public static String getContent() {
        return "{\n" +
                "\t\"dataType\": \"12\",\n" +
                "\t\"endTime\": \"2020-03-24 20:10:00\",\n" +
                "\t\"indexDataList\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"areaCode\": 8440000,\n" +
                "\t\t\t\"attrList\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"WARNER\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158270690878\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"IDEPSR\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 4072029252,\n" +
                "\t\t\t\t\t\"indexResultId\": 4072029300,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"WARN_SOURCE\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158270201491\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"IDEP\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 4072029253,\n" +
                "\t\t\t\t\t\"indexResultId\": 4072029300,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"WARN_MSG\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158270107922\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"严重0324 20:05 IDEPV3客户端正常\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 4072029254,\n" +
                "\t\t\t\t\t\"indexResultId\": 4072029300,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"WARN_TIME\",\n" +
                "\t\t\t\t\t\"featureCd\": \"707194018980\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"2020-03-24 20:05:06\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 4072029255,\n" +
                "\t\t\t\t\t\"indexResultId\": 4072029300,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"columnName\": \"TA_WARN_LEVEL\",\n" +
                "\t\t\t\t\t\"featureCd\": \"158210204155\",\n" +
                "\t\t\t\t\t\"featureType\": \"11\",\n" +
                "\t\t\t\t\t\"featureValue\": \"10.0\",\n" +
                "\t\t\t\t\t\"indexRestExtId\": 4072029256,\n" +
                "\t\t\t\t\t\"indexResultId\": 4072029300,\n" +
                "\t\t\t\t\t\"serialId\": 0\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"indexResultId\": 4072029300,\n" +
                "\t\t\t\"indexValue\": \"10\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"indexId\": 158270704270,\n" +
                "\t\"indexStatCycleCd\": \"5001\",\n" +
                "\t\"netObjId\": 0,\n" +
                "\t\"resourceId\": 0,\n" +
                "\t\"servTreeObjId\": 158243665991,\n" +
                "\t\"sourceSystem\": 0,\n" +
                "\t\"startTime\": \"2020-03-24 20:05:00\",\n" +
                "\t\"timeStamp\": \"2020-03-24 20:10:36\"\n" +
                "}";
    }

}
