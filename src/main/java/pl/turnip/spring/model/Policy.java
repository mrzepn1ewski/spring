package pl.turnip.spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String number;

    private LocalDate insuranceStartDate;

    private LocalDate insuranceEndDate;

    private Double ocValue;

    private Double acValue;

    private Double nnwValue;

    private Double glassValue;

    private Boolean isActive;
}
