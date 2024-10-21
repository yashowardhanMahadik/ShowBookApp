package model;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Theater {
    private final String id;
    private final String name;
    private final String address;
    //etc
}
