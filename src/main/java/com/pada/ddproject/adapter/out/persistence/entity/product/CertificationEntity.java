package com.pada.ddproject.adapter.out.persistence.entity.product;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@SuppressWarnings("java:S1068") // Suppress warning about unused private fields until logic is implemented
@Entity
@Getter
@Setter
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "certification")
class CertificationEntity {

    @Id
    @SequenceGenerator(name = "certification_id_sequence", sequenceName = "certification_id_seq", allocationSize = 10)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "certification_id_sequence")
    private Long id;

    private String issuer;

    private LocalDateTime certificationDate;

    private LocalDateTime validDate;
}
