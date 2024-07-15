package Ecommerce.Profile.Profile_Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRemote remote;
    //to add datas
    public Profile addDatas(Profile profile) {
        return remote.save(profile);
    }
        //to view all datas
    public List<Profile> showDatas(){
        return remote.findAll();
    }
    public Profile implementFindById(int profileId){
        return remote.findById(profileId).orElse(new Profile());
    }
//to delete

    public void removeData(int id){
        remote.deleteById(id);
    }
public List<Profile> implementFindProfile(int orderId){
        return remote.findAllByOrderId(orderId);
}
}
