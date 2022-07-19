package com.gl.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.gl.model.Role;
import com.gl.model.Employee;
import com.gl.model.User;
import com.gl.repository.RoleRepository;
import com.gl.repository.EmployeeRepository;
import com.gl.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BootStrapAppData implements ApplicationListener<ApplicationReadyEvent>{
	
	private final PasswordEncoder passwordEncoder;
	
	private final EmployeeRepository studentRepository;
	private final RoleRepository roleRepository;
	private final UserRepository userRepository;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		/*// implement faker here
		for(int i=0; i<10; i++) {
			Student student = new Student();
			student.setFirstName("Sameer" + i);
			student.setLastName("asd" + i);
			student.setCountry("In" + i);
			student.setCourse("IT" + i);
			studentRepository.save(student);
		}
		
		
		Role userRole=new Role();
		userRole.setRoleName("ROLE_USER");
		
		Role adminRole=new Role();
		adminRole.setRoleName("ROLE_ADMIN");
		
		User user=new User();
		user.setUserName("user");
		user.setPassword(passwordEncoder.encode("user"));
		
		User admin=new User();
		admin.setUserName("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
				
		admin.addRole(adminRole);
		admin.addRole(userRole);
		
		user.addRole(userRole);
		
		userRepository.save(user);
		userRepository.save(admin);
		
		roleRepository.save(userRole);
		roleRepository.save(adminRole);
	}*/

}
}
