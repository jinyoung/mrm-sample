package mrmsample.infra;

import java.util.List;
import mrmsample.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "dashboards",
    path = "dashboards"
)
public interface DashboardRepository
    extends PagingAndSortingRepository<Dashboard, Long> {
    List<Dashboard> findByStandardId(Long standardId);
}
