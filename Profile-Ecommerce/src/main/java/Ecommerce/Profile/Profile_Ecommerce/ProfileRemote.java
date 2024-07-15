package Ecommerce.Profile.Profile_Ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRemote extends JpaRepository<Profile,Integer> {
    List<Profile> findAllByOrderId(int orderId);
}
