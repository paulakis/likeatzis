package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Customer extends Person {

    private boolean professional;
}
