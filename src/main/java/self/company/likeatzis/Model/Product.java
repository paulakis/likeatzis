package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName;
    private String productPhoto;
    private double productPrice;
    private double productAvailableQuantity;
    private Date productionDate;
    private Date expirationDate;
    private boolean refrigerated;
}
