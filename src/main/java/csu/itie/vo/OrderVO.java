package csu.itie.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import csu.itie.entity.order.LineItem;
import lombok.Data;

import java.util.List;

@Data
public class OrderVO {
    // order 字段
    private int orderId;
    private String userName;
    private int lineNum;
    private String payMethod;
    private float totalPrice;

    // orderStatus 字段
    private String status;

    // LineItem 字段
    private List<LineItem> lineItemList;

}
