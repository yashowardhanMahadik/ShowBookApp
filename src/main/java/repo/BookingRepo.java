package repo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Booking;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
@AllArgsConstructor
@Getter
public class BookingRepo {
    private Map<String,Booking> bookings;

    public void addBooking(Booking booking){
        if(bookings == null){
            bookings = new HashMap<>();
        }
        bookings.put(booking.getBooking_id(),booking);
    }

    public Booking getBooking(String bookingId){
        return bookings.get(bookingId);
    }

}
