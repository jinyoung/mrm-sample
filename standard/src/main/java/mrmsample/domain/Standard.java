package mrmsample.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mrmsample.StandardApplication;
import mrmsample.domain.StandardChanged;
import mrmsample.domain.StandardRegistered;

@Entity
@Table(name = "Standard_table")
@Data
public class Standard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String prodName;

    private Long prodNum;

    @PostPersist
    public void onPostPersist() {
        StandardRegistered standardRegistered = new StandardRegistered(this);
        standardRegistered.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        StandardChanged standardChanged = new StandardChanged(this);
        standardChanged.publishAfterCommit();
    }

    public static StandardRepository repository() {
        StandardRepository standardRepository = StandardApplication.applicationContext.getBean(
            StandardRepository.class
        );
        return standardRepository;
    }
}
