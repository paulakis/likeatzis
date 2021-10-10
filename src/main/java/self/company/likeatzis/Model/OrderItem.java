package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class OrderItem {

    @Id
    private String id;
    private String orderItemName;
    private double price;
    private UnitOfMeasure unitOfMeasure;
    private double quantity;


}
