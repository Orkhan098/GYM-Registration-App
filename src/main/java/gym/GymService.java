package gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GymService {


    private final GymRepository gymRepository;
    private Gym gym;

    @Autowired
    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }


    public void save(Gym gym) {
        gymRepository.save(gym);
    }


    public List<Gym> getMembers(){
        List<Gym> memberList=new ArrayList<>();
        gymRepository.findAll().forEach(memberList::add);
        return memberList;
    }
}
