
  package com.stdnt.stdntmanager.repository;
  
  import java.util.List;
  
  import org.springframework.data.repository.CrudRepository;
  
  import com.stdnt.stdntmanager.model.Student;
  
  public interface StudentRepository extends CrudRepository<Student, Long> {
 
	  public List<Student> findAll(); 
	  public Student findById(long id); 
	  
  }
 