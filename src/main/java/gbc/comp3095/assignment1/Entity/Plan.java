package gbc.comp3095.assignment1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "plans")
public class Plan {
    @Id
    @GeneratedValue
    private int id;
    private String mealTime;
    private LocalDate date;

    @ManyToOne
    Recipe recipe;
}
