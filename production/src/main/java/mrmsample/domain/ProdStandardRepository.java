package mrmsample.domain;

import mrmsample.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "prodStandards",
    path = "prodStandards"
)
public interface ProdStandardRepository
    extends PagingAndSortingRepository<ProdStandard, Long> {}
