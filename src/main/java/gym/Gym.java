package gym;

import javax.persistence.*;
import java.util.List;

@Entity
@Table ( name = "Members")
public class Gym {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column ( name = "memberID")
    private Long id;

    @Column ( name = "memberName")
    private String name;
    @Column ( name = "memberSurN")
    private String surname;
    @Column ( name = "memberEmail")
    private String email;
    @Column ( name = "memberPhone")
    private String phone;
    @Column ( name = "memberPass")
    private String passId;
    @Column ( name = "memberGen")
    private String gender;
    @Column ( name = "memberNo")
    private String seNo;


    public Gym() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassId() {
        return passId;
    }

    public void setPassId(String passId) {
        this.passId = passId;
    }
    public String getSeNo() {
        return seNo;
    }

    public void setSeNo(String seNo) {
        this.seNo = seNo;
    }
}
