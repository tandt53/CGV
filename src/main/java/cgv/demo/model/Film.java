package cgv.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "tb_film")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "director")
    private String director;

    @Column(name = "cast")
    private String cast;

    @Column(name = "genre")
    private String genre;

    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name = "running_time")
    private int runningTime;

    @Column(name = "language")
    private String language;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "description")
    private String description;

    @NaturalId
    private String slug;

    @ManyToMany(mappedBy = "films", fetch = FetchType.LAZY)
    private List<Event> events;

    @Column(name = "status")
    private int status;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Ticket ticket;
}
