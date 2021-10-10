package self.company.likeatzis.Model.dtos.order;

import lombok.Data;
import self.company.likeatzis.Model.OrderItem;

import java.util.List;

@Data
public class UpdateOrderDto {

    private List<OrderItem> orderItems;
}
