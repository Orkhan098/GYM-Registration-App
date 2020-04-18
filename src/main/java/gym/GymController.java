package gym;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class GymController {
    @GetMapping("/gym")
    public String sendForm(Gym gym) {

        return "gym";
    }

    @PostMapping("/gym")
    public String processForm(Gym gym) {

        return "member";
    }






    //    @Autowired
//    private static Gym gym;

//    @RequestMapping("/member")
//    public String index(){
//        return "gym";
//    }


//    @RequestMapping("/member" )
//    public String members(Model model){
//
//        model.addAttribute("name",gym.getName());
//        model.addAttribute("surname",gym.getSurname());
//        model.addAttribute("email",gym.getEmail());
//        model.addAttribute("phone",gym.getPhone());
//
//        return "member";
//    }





}
