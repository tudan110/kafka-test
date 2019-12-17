package indi.tudan.kafka;

public class TT {

    public static void main(String[] args) {
        System.out.println("busi_type=0".contains("="));

        String content = "{PERIOD_TIME}，{SERV_TREE_OBJ_NAME}为{SUM_COUNT}笔，充值成功{SUCC_COUNT}笔，充值失败{FAIL_COUNT}笔，充值成功率为{RECHARGE_SUCC_RATE}%，低于阈值{CONTROL_VALUE}%，{BUSI_TYPE=0}，请关注!";
        String attrName = "busi_type=0";
        content = content.replaceAll("\\{" + attrName + "}([,，])", "");
        System.out.println(content);
    }
}
