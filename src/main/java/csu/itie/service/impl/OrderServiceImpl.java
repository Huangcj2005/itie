package csu.itie.service.impl;

import csu.itie.common.CommonResponse;
import csu.itie.entity.order.LineItem;
import csu.itie.service.OrderService;
import csu.itie.vo.OrderVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public CommonResponse<List<OrderVO>> getOrdersByUsername(String username) {
        return null;
    }

    @Override
    public void insertOrderVO(OrderVO orderVO, List<LineItem> lineItemList) {

    }

    @Override
    public CommonResponse<OrderVO> getOrderByOrderId(String orderId) {
        return null;
    }
}
