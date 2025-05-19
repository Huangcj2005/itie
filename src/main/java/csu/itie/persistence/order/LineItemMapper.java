package csu.itie.persistence.order;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import csu.itie.entity.order.LineItem;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemMapper extends BaseMapper<LineItem> {
}
