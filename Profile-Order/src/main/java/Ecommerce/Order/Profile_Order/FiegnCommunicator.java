package Ecommerce.Order.Profile_Order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor",url = "http://localhost:8091/profile")
public interface FiegnCommunicator {
    @GetMapping("/order/{orderId}")
    public List<Profile> callProfile(@PathVariable("orderId")int orderId);
}


//package Ecommerce.Order.Profile_Order;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.List;
//
//@FeignClient(name = "Feign-Interceptor",url = "http://localhost:8091/profile")
//public interface FeignCommunicator {
//    @GetMapping("/order/{orderId}")
//    public List<Profile> callProfile(@PathVariable("orderId")int orderId);
//}

