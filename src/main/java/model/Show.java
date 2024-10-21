package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
@AllArgsConstructor
@Getter
public class Show {
    private final String id;
    private final String movieName;
    private final Instant startTime;
    private final Instant endTime;
    private final Theater theater;
    private List<Seat> theaterSeats;

}
