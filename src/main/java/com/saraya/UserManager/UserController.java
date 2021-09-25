package com.saraya.UserManager;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.entity.UserInformation;
import com.saraya.repository.UserRepo;

@Controller
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	//private ArrayList<UserInformation> users =new ArrayList<UserInformation>();
	
	@PostMapping("addUser")
	public String addUser( @RequestParam String name,@RequestParam String password,@RequestParam String email  ) {
		userRepo.save(new UserInformation(email,name,password));
		return "redirect:/users";
	}
	
	@GetMapping("/users")
	public String showUsers(ModelMap model){
		 model.addAttribute("users", userRepo.findAll()); 
		return "homepage";
	}
	
	
}
 