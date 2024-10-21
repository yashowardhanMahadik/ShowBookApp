package model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Seat {
    int row;
    String column;
    private Seatlock lockStatus;

    Seat(int row, String col){
        this.row = row;
        this.column = col;
        this.lockStatus = Seatlock.UNLOCKED;
    }
}
