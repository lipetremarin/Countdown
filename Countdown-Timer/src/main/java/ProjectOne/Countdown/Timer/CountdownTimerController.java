package ProjectOne.Countdown.Timer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountdownTimerController {
	
	@RequestMapping("/countdown")
	public String GetEvent() {
		return "countdown";
	}
	
}
