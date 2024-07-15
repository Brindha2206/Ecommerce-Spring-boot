package Ecommerce.Order.Profile_Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    int profileId;
    String email;
    String fullName;
    String dob;
    long contact;
}
