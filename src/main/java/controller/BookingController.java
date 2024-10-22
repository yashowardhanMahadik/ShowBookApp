package controller;

import model.Booking;
import model.PaymentStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.BookingService;

import java.util.List;

@RestController("/booking")
public class BookingController {

    BookingService bookingService;

    BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    ResponseEntity<?> createBooking(@RequestBody Booking booking){
        booking = new Booking("1","2", PaymentStatus.NOT_STARTED,30);
        booking.setSelectedSeatIds(List.of("1,1","2,2","8,8"));

        bookingService.createBooking(booking);
        return ResponseEntity.ok("Created");
    }
}
