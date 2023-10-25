package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "grades", path = "grades")
public interface GradeRepository
    extends PagingAndSortingRepository<Grade, String> {}
