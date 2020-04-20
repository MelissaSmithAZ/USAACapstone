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
    public Policy getOnePolicy(@PathVariable int id) {
        Policy policy = policysService.getOnePolicy(id).orElseThrow(IllegalArgumentException::new);
        return policy;
    }

    @PostMapping
    public Policy addOnePolicy(@RequestBody Policy newPolicy) {
        if (newPolicy.getPolicy() == null )   {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return policysService.addOnePolicy(newPolicy);
    }

    @PatchMapping
    public Policy updateOnePolicy(@RequestBody Policy updatedPolicy) {
        Policy policy = policysService.getOnePolicy(updatedPolicy.getId()).orElseThrow(IllegalArgumentException::new);
        return policysService.updateOnePolicy(updatedPolicy);
    }

    @DeleteMapping("/{id}")
    public String removeOnePolicy(@PathVariable int id) {
        Policy policy = policysService.getOnePolicy(id).orElseThrow(IllegalArgumentException::new);
        return policysService.removeOnePolicy(id);
    }
}
