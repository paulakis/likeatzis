package self.company.likeatzis.Model.dtos;

import lombok.Data;

@Data
public class UserCreationDto {

    private String name;
    private String afm;
    private String socialNumber;
    private String identityId;
    private String amka;
    private boolean creation;

}
