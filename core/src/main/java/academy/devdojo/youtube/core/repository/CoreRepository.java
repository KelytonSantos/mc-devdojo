package academy.devdojo.youtube.core.repository;

import academy.devdojo.youtube.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CoreRepository extends PagingAndSortingRepository<Course, Long> {
}
