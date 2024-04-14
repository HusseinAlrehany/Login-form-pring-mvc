package com.login.form.controller;

import javax.naming.AuthenticationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.form.entity.UserProfile;
import com.login.form.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/Login")
	public String showUserLoginForm(Model theModel) {

		UserProfile user = new UserProfile();

		theModel.addAttribute("users", user);

		return "signin-form";

	}

	@GetMapping("/signUpForm")
	public String showUserSignUpForm(Model theModel) {

		UserProfile user = new UserProfile();

		theModel.addAttribute("users", user);

		return "signup-form";

	}

	@PostMapping("/saveUser")
	public String saveUser( @ModelAttribute("user") UserProfile theUser) {
		

		userService.saveUser(theUser);

		return "welcome-page";

	}

	@PostMapping("/checkUser")
	public String validateUser(@Valid @ModelAttribute("users") UserProfile user, Model theModel, BindingResult result) {

		if (result.hasErrors()) {
			return "signin-form";
		}

		if (!userService.validateUser(user.getUserName(), user.getPassWord())) {

			theModel.addAttribute("errorMessage", "Invlid UserName or PassWord");

			return "signin-form";

		}
		

		return "welcome-page";

	}
}