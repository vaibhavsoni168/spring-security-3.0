package spring30.springsecurity30.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring30.springsecurity30.repository.UserInfoRepository;

@RestController
@RequestMapping("/auth") 
public class ProductController {
	
	@Autowired
	UserInfoRepository repository;

	
	@GetMapping("/hello")
	public String getMessage() {
		
		
		return "user name "+repository.findAll().get(0).getName() +" Password "+repository.findAll().get(0).getPassword();
	}
	
	  @GetMapping("/welcome") 
	    public String welcome() { 
	        return "Welcome this endpoint is not secure"; 
	    } 
	  
	    @GetMapping("/user/userProfile") 
//	    @PreAuthorize("hasAuthority('ROLE_USER')") 
	    public String userProfile() { 
	        return "Welcome to User Profile"; 
	    } 
	  
	    @GetMapping("/admin/adminProfile") 
//	    @PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	    public String adminProfile() { 
	        return "Welcome to Admin Profile"; 
	    } 
}
