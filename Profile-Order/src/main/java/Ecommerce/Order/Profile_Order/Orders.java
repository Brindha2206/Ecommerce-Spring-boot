package Ecommerce.Order.Profile_Order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String orderDate;
    private String orderedBy;
    private double paymentMethod;
    private transient List<Profile> myLists;

    public void setMyLists(List<Profile> profiles) {
    }

    public int getOrderId() {
        return orderId;
    }
}
