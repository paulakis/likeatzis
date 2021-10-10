package self.company.likeatzis.Controllers;

import org.springframework.web.bind.annotation.*;
import self.company.likeatzis.Model.dtos.order.UpdateOrderDto;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    @RequestMapping("{id}")
    public void getOrder(@RequestParam("id") String id) {

    }

    @PostMapping
    public void insertOrder(@RequestBody UpdateOrderDto updateOrderDto) {

    }

    @PostMapping
    @RequestMapping("{id}")
    public void updateOrder(@RequestParam("id") String id, @RequestBody UpdateOrderDto updateOrderDto) {

    }
}
