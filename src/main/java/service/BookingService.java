package service;

import model.Booking;
import repo.BookingRepo;

public class BookingService {

    BookingRepo bookingRepo;

    public BookingService(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public void createBooking(Booking booking){
        bookingRepo.addBooking(booking);
    }

}
