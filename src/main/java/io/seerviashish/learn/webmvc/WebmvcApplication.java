package io.seerviashish.learn.webmvc;

import io.seerviashish.learn.webmvc.model.Student;
import io.seerviashish.learn.webmvc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebmvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebmvcApplication.class, args);
	}


	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student s1 = new Student("FName1", "LName1", "fl1@g.com");
		studentRepository.save(s1);
		Student s2 = new Student("FName2", "LName2", "fl2@g.com");
		studentRepository.save(s2);
		Student s3 = new Student("FName3", "LName3", "fl3@g.com");
		studentRepository.save(s3);
	}
}
