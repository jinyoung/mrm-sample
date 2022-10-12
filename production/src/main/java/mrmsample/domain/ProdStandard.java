package mrmsample.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mrmsample.ProductionApplication;

@Entity
@Table(name = "ProdStandard_table")
@Data
public class ProdStandard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static ProdStandardRepository repository() {
        ProdStandardRepository prodStandardRepository = ProductionApplication.applicationContext.getBean(
            ProdStandardRepository.class
        );
        return prodStandardRepository;
    }

    public static void standardRegist(StandardRegistered standardRegistered) {
        /** Example 1:  new item 
        ProdStandard prodStandard = new ProdStandard();
        repository().save(prodStandard);

        */

        /** Example 2:  finding and process
        
        repository().findById(standardRegistered.get???()).ifPresent(prodStandard->{
            
            prodStandard // do something
            repository().save(prodStandard);


         });
        */

    }

    public static void standardChange(StandardChanged standardChanged) {
        /** Example 1:  new item 
        ProdStandard prodStandard = new ProdStandard();
        repository().save(prodStandard);

        */

        /** Example 2:  finding and process
        
        repository().findById(standardChanged.get???()).ifPresent(prodStandard->{
            
            prodStandard // do something
            repository().save(prodStandard);


         });
        */

    }
}
