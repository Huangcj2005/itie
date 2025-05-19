package csu.itie.entity.order;

import csu.itie.vo.OrderVO;
import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    private OrderVO orderVO;
    private List<LineItem> lineItemList;
}
