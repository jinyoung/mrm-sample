package mrmsample.domain;

import mrmsample.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "standards", path = "standards")
public interface StandardRepository
    extends PagingAndSortingRepository<Standard, Long> {}
