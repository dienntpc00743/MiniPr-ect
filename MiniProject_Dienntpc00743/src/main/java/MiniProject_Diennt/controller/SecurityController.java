package MiniProject_Diennt.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	@RequestMapping("/security/login/form")
	public String loginform(Model model) {
		model.addAttribute("message", "Vui lòng đăng nhập tài khoản !!!");
		return "security/login";

	}

	@RequestMapping("/security/login/success")
	public String loginsuccess(Model model) {
		model.addAttribute("message", " Đăng nhập thành công !!!");
		return "security/login";

	}

	@RequestMapping("/security/login/error")
	public String loginerror(Model model) {
		model.addAttribute("message", " Tài khoản hoặc mật khẩu không chính xác !!!");
		return "security/login";

	}

	@RequestMapping("/security/logoff")
	public String loginlogoff(Model model) {
		model.addAttribute("message", " Đăng xuất thành công !!!");
		return "Redirect:/product/list";

	}

}
