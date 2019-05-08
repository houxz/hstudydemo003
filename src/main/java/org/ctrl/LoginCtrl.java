package org.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginCtrl {

	@RequestMapping(value="/login")
	public String  LoadPage() {
		System.out.println("==========LoginCtrl::LoadPage()==================");
		return "login";
	}
}