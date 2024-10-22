package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@Component
@Getter
public class Show {
    public Show(String id, String movieName) {
        this.id = id;
        this.movieName = movieName;
        this.startTime = Instant.now();
        this.endTime = Instant.now().plusSeconds(3600);
        this.theater = null;
    }

    private final String id;
    private final String movieName;
    private final Instant startTime;
    private final Instant endTime;
    private final Theater theater;
    @Setter
    private Map<String,Seat> theaterSeats;

}
