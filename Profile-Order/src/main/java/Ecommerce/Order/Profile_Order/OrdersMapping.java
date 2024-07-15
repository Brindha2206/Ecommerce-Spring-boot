package Ecommerce.Order.Profile_Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersMapping {
    @Autowired
    public OrderService service;

    @PostMapping("/add")
    public Orders adds(@RequestBody Orders orders){
        return service.addDatas(orders);
    }
    @GetMapping("/get")
    public List<Orders> showingData(){
        return service.showData();
    }
    @PutMapping("/change")
    public Orders changes(@RequestBody Orders orders){
        return service.addDatas(orders);
    }
    @DeleteMapping("/del/{id}")
    public String removes(@PathVariable("id")int id){
        service.removeData(id);
        return id +"has been removed";
    }

}
