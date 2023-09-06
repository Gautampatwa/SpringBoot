package com.example.Employee.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Bonus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String joiningbonus;
    private String perfbonus;
    private String incentive;
    private int increment;
}
