package com.pada.ddproject.domain.model.product;

import java.time.LocalDateTime;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
class Certification {
    private String certificationId;
    private String issuer;
    private LocalDateTime certificationDate;
    private LocalDateTime validDate;
}
