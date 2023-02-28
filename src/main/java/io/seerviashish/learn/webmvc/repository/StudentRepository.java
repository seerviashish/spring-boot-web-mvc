package io.seerviashish.learn.webmvc.repository;

import io.seerviashish.learn.webmvc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
