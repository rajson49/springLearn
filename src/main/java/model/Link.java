package model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;

@Entity
@NoArgsConstructor
@Data  // Give us getter and setters and auto generate constructor
public class Link extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    // comment
    @OneToMany(mappedBy = "link")
    private List<Comment> comments=new ArrayList<Comment>();


}
