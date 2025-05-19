package csu.itie.controller.front;

import csu.itie.common.CommonResponse;
import csu.itie.common.ResponseCode;
import csu.itie.entity.order.LineItem;
import csu.itie.entity.order.OrderRequest;
import csu.itie.service.OrderService;
import csu.itie.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/order/")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    @ResponseBody
    public CommonResponse<List<OrderVO>> getOrdersByUsername(String username){
        return orderService.getOrdersByUsername(username);
    }

    @PostMapping("submit")
    @ResponseBody
    public CommonResponse<List<OrderVO>> insertOrderVO(@RequestBody OrderRequest request){
        if(request.getLineItemList().isEmpty()){
            return CommonResponse.createForError(ResponseCode.NO_LINEITEM.getCode(),"该订单有误，无lineitem，是空订单");
        }
        orderService.insertOrderVO(request.getOrderVO(),request.getLineItemList());
        return CommonResponse.createForSuccessMessage("成功提交订单");
    }

    @GetMapping("by{orderId}")
    public CommonResponse<OrderVO> getOrderByOrderId(String orderId){
        return orderService.getOrderByOrderId(orderId);
    }

}
