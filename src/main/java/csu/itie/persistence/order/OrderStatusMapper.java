package csu.itie.persistence.order;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.itie.entity.order.OrderStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusMapper extends BaseMapper<OrderStatus> {
}
