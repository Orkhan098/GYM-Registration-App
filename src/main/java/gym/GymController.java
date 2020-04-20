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


}
