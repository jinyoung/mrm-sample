package mrmsample.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mrmsample.PackingApplication;
import mrmsample.domain.PackingCompleted;

@Entity
@Table(name = "Packing_table")
@Data
public class Packing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long standardId;

    private Integer qty;

    private String status;

    @PostPersist
    public void onPostPersist() {
        PackingCompleted packingCompleted = new PackingCompleted(this);
        packingCompleted.publishAfterCommit();
    }

    public static PackingRepository repository() {
        PackingRepository packingRepository = PackingApplication.applicationContext.getBean(
            PackingRepository.class
        );
        return packingRepository;
    }

    public static void packingRequest(ProductProduced productProduced) {
        /** Example 1:  new item 
        Packing packing = new Packing();
        repository().save(packing);

        */

        /** Example 2:  finding and process
        
        repository().findById(productProduced.get???()).ifPresent(packing->{
            
            packing // do something
            repository().save(packing);


         });
        */

    }
}
