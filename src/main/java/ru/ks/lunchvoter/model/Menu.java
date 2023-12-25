package ru.ks.lunchvoter.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name ="menu")
public class Menu extends BaseEntity {

    @NotNull
    @JoinColumn(name = "restaurant_id", nullable = false)
    @ManyToOne
    private Restaurant restaurant;

    @Column(name = "for_date", nullable = false)
    @NotNull
    private Date date = new Date();

    @Column(name = "description", nullable = false)
    @NotBlank
    @Size(min = 2, max = 250)
    private String description;

    @DecimalMin("0.0")
    @Column(name = "price")
    private Double price;
}
