package gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;


@Controller
public class GymController {

    private final GymService gymService;
    private Gym gym;

    @Autowired
    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping("/gym")
    public String sendForm(Gym gym) {
        return "gym";
    }

    @PostMapping("/gym")
    public String processForm(Gym gym) {
        gymService.save(gym);
        return "redirect:/gym";
    }

    @GetMapping("/gym/members")
    public String getMemberList(Model model){
        model.addAttribute("members",gymService.getMembers());
        return "member";
    }


}
