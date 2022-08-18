package by.tms.model;

import lombok.*;
import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="films")

public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Column(name = "filmYear")
    private int year;
    private String genre;
    private boolean watched;
}
