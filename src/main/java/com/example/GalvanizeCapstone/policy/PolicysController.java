package com.example.GalvanizeCapstone.policy;

import com.example.GalvanizeCapstone.members.Member;
import com.example.GalvanizeCapstone.members.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/policys")
public class PolicysController {

    @Autowired
    private final PolicysService policysService;

    public PolicysController(PolicysService policysService) {
        this.policysService = policysService;
    }

    @GetMapping
    public List<Policy> getAllPolicys() {
        return  this.policysService.getAllPolicys();
    }

    @GetMapping("/{id}")
    public Member getOneContact(@PathVariable int id) {
        Member member = membersService.getOneMember(id).orElseThrow(IllegalArgumentException::new);
        return member;
    }

    @PostMapping
    public Member addOneMember(@RequestBody Member newMember) {
        if (newMember.getEmail() == null || newMember.getAddress() == null || newMember.getMember_number() < 0 || newMember.getMember_name() == null || newMember.getPhone() == null     || newMember.getBase_state() == null  || newMember.getAuto_1() == null){
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return membersService.addOneMember(newMember);
    }

    @PatchMapping
    public Member updateOneMember(@RequestBody Member updatedMember) {
        Member member = membersService.getOneMember(updatedMember.getId()).orElseThrow(IllegalArgumentException::new);
        return membersService.updateOneMember(updatedMember);
    }

    @DeleteMapping("/{id}")
    public String removeOneMember(@PathVariable int id) {
        Member member = membersService.getOneMember(id).orElseThrow(IllegalArgumentException::new);
        return membersService.removeOneMember(id);
    }
}
