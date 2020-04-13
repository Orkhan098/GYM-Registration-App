package gym;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller

public class GymController {
//    @Autowired
//    private GymRepository gymRepository;

    @RequestMapping("/")
    public String index(){

        return "gym";
    }

}
