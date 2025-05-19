package csu.itie.persistence.order;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.itie.entity.order.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends BaseMapper<Order> {
}
