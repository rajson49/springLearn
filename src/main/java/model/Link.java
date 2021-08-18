package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data  // Give us getter and setters and auto generate constructor
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

}
