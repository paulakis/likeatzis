package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class OrderItem {

    private String orderItemName;
    private double price;
    private UnitOfMeasure unitOfMeasure;
    private double quantity;


}
