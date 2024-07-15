package Ecommerce.Profile.Profile_Ecommerce;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileMapping {
    @Autowired
    public ProfileService service;

    @PostMapping("/add")
    public Profile adds(@RequestBody Profile profile){
        return service.addDatas(profile);
    }

    @GetMapping("/get")
    public List<Profile> showingDatas(){
        return service.showDatas();
    }

    @PutMapping("/change")
    public Profile changes(@RequestBody Profile profile){
        return service.addDatas(profile);
    }

    @DeleteMapping("/del/{id}")
    public String removes(@PathVariable("id")int id){
        service.removeData(id);
        return id +"has been removed";
    }
    @GetMapping("/order/{orderId}")
    public List<Profile> oneDetail(@PathVariable("orderId")int orderId){
        return service.implementFindProfile(orderId);
    }
}
