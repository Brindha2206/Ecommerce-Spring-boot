package Ecommerce.Order.Profile_Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRemote remote;

    @Autowired
    FiegnCommunicator fiegnCommunicator;

//    public Orders implementFindById(int id){
//        Orders obj = remote.findById(id).orElse(new Orders());
//        if(obj!=null){
//            obj.setMyLists(feignCommunicator.callProfile(obj.getOrderId()));
//        }
//        return obj;
//    }
    public Orders implementFindById(int id){
        Orders obj = remote.findById(id).orElse(new Orders());
        if (obj!=null){
            obj.setMyLists(fiegnCommunicator.callProfile(obj.getOrderId()));
        }
        return obj;
    }

    public Orders addDatas(Orders orders){
        return remote.save(orders);
    }
    public List<Orders> showData(){
        return remote.findAll();
    }
    public void removeData(int id){
        remote.deleteById(id);
    }

}
