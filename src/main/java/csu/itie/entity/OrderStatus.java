package csu.itie.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("orderstatus")
public class OrderStatus {
    private String orderId;
    private int lineNum;
    private String courseId;
    private int quantity;
    private float uniPrice;     // 原始价格
    private float discount;     // 折扣优惠的价格
}
