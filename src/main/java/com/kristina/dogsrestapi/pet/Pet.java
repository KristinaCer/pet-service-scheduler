package com.kristina.dogsrestapi.pet;

import com.kristina.dogsrestapi.user.Customer;
import com.kristina.dogsrestapi.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PetType type;
    @Nationalized
    private String name;
    private long ownerId;
    private LocalDate birthDate;
    private String notes;
    @ManyToOne
    private User user;
}