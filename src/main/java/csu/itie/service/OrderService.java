package csu.itie.service;

import csu.itie.common.CommonResponse;
import csu.itie.entity.order.LineItem;
import csu.itie.vo.OrderVO;

import java.util.List;

public interface OrderService {
    public CommonResponse<List<OrderVO>> getOrdersByUsername(String username);
    public void insertOrderVO(OrderVO orderVO, List<LineItem> lineItemList);
    public CommonResponse<OrderVO> getOrderByOrderId(String orderId);

}
