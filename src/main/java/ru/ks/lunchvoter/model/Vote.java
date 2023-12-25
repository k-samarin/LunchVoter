package ru.ks.lunchvoter.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name ="vote")
public class Vote extends BaseEntity {

    @NotNull
    @JoinColumn(name = "restaurant_id", nullable = false)
    @ManyToOne
    private Restaurant restaurant;

    @NotNull
    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne
    private User user;

    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDateTime dateTime;
}
