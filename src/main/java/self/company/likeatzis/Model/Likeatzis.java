package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Likeatzis extends Person{

    @OneToMany
    private List<Product> products;

}
