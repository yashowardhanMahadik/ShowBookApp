package model;

import org.springframework.stereotype.Component;

@Component
public enum PaymentStatus {
    COMPLETED, FAILED, NOT_STARTED
}
