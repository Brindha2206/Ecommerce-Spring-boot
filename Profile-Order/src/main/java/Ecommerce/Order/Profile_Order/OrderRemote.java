package Ecommerce.Order.Profile_Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRemote extends JpaRepository<Orders,Integer> {

}
