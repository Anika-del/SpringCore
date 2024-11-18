package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Student stdId() {
		Student std = new Student();
		std.setName("Amika");
		std.setRollno(103);
		std.setEmail("amik@gmail.com");
		return std;
	}
	
	//or
	/*@Bean("stdObj2")
	public Student createStdBeanObj2() {
		Student std1 = new Student();
		std1.setName("Amita");
		std1.setRollno(104);
		std1.setEmail("ami@gmail.com");
		
		return std1;
		
	}*/
}
