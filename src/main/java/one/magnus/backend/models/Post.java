package one.magnus.backend.models;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Slf4j
@Entity
public class Post {

    @Id
    @GeneratedValue
    @Getter
    private Long id;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String body;
    @CreationTimestamp
    @Getter
    private LocalDateTime creationDateTime;
    @UpdateTimestamp
    @Getter
    private LocalDateTime lastUpdatedDateTime;

    public Post() {};
}
