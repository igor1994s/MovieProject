package by.tms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Film {
    private int id;
    private String title;
    private int year;
    private String genre;
    private boolean watched;
}
