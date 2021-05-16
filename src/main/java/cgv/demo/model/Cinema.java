package cgv.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_cinema")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "location")
    private String location;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cinema_id")
    private List<Room> rooms;

    @ManyToMany(mappedBy = "cinemas", fetch = FetchType.LAZY)
    private List<Event> events;

    @Column(name = "status")
    private String status;

    public Cinema(String name, String location, List<Room> rooms, List<Event> events, String status) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.events = events;
        this.status = status;
    }

    public Cinema() {

    }
}
