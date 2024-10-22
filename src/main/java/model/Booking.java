package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Builder
@Data
@AllArgsConstructor
public class Booking {

    public Booking(String booking_id, String user_id, PaymentStatus paymentStatus, int cost) {
        this.booking_id = booking_id;
        this.user_id = user_id;
        this.paymentStatus = paymentStatus;
        this.cost = cost;
    }

    private String booking_id;
    private String user_id;
    private String showId;
    private PaymentStatus paymentStatus;
    private int cost;
    private List<String> selectedSeatIds;

}
