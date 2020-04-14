package gym;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class GymController {
    public Gym gym;
//    @Autowired
//    private GymService gymService;

//    public GymController(GymService gymService) {
//        this.gymService = gymService;
//    }

    @RequestMapping("/")
    public String index(){

        return "gym";
    }

    @RequestMapping("/member.html" )
    public String members(Model model){
//        model.addAttribute("name",gym.getName());
//        model.addAttribute("surname",gym.getSurname());
//        model.addAttribute("email",gym.getEmail());
//        model.addAttribute("phone",gym.getPhone());

        return "member";
    }

}
