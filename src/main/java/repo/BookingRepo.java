package repo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import model.Booking;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
@Getter
public class BookingRepo {
    private List<Booking> bookings;

    public void addBooking(Booking booking){
        if(bookings == null){
            bookings = new ArrayList<Booking>();
        }
        bookings.add(booking);
    }

}
