package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Order {
    @Id
    private long id;
    @OneToMany
    private List<OrderItem> orderItems;

}
