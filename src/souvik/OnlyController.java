package souvik;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class OnlyController {
@RequestMapping("/form")
public String show(){
	return "form";
}
@RequestMapping("/data")
public String add(@ModelAttribute("student") Student student,Model m)
{
	//String name=r.getParameter("name");
	//int roll=Integer.parseInt(r.getParameter("roll"))
	m.addAttribute("name",student.getName());
	int roll=student.getId();
	m.addAttribute("roll",roll);
	return "show";

}
}