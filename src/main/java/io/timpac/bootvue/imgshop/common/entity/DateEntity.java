package io.timpac.bootvue.imgshop.common.entity;

import jakarta.persistence.Embeddable;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Embeddable
public class DateEntity {
    @CreationTimestamp
    private LocalDateTime regDate;
    @CreationTimestamp
    private LocalDateTime updDate;
}
