package pipeline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pipeline.entity.Student;

/**
 * Created by Shli on 06/09/2017.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
