package self.company.likeatzis.Controllers;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;
import self.company.likeatzis.Model.dtos.UserCreationDto;
import self.company.likeatzis.Model.dtos.UserInfoDto;

@RestController
@RequestMapping("/user")
public class IndividualController {

    @GetMapping
    @RequestMapping("/information/{id}")
    public UserInfoDto getUserInformation(@RequestParam("id") String id) {
        return new UserInfoDto();
    }

    @PostMapping
    @RequestMapping("creation")
    public UserInfoDto createNewUser(@RequestBody UserCreationDto userCreationDto) {
        return new UserInfoDto();
    }

    @DeleteMapping
    @RequestMapping("/{userId}")
    public void deleteUser(@RequestParam("userId") String userId) {

    }

    @PostMapping
    @RequestMapping("/update")
    public UserCreationDto updateExistingUser(@RequestBody UserCreationDto userCreationDto) {
        return new UserCreationDto();
    }


}
