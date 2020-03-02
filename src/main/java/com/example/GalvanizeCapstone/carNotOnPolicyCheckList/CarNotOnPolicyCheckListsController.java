package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import com.example.GalvanizeCapstone.claims.Claim;
import com.example.GalvanizeCapstone.claims.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("carNotOnPolicyCheckList")

public class CarNotOnPolicyCheckListsController {
    @Autowired
    private final CarNotOnPolicyCheckListsService carNotOnPolicyCheckListsService;

    @Autowired
    private  final ClaimsService claimsService;
    public CarNotOnPolicyCheckListsController(CarNotOnPolicyCheckListsService carNotOnPolicyCheckListsService, ClaimsService claimsService) {
        this.carNotOnPolicyCheckListsService = carNotOnPolicyCheckListsService;
        this.claimsService = claimsService;
    }


    public CarNotOnPolicyCheckListsService getCarNotOnPolicyCheckListsService() {
        return carNotOnPolicyCheckListsService;
    }

    @GetMapping
    public List<CarNotOnPolicyCheckList> getAllCarNotOnPolicyCheckLists() {
        return this.carNotOnPolicyCheckListsService.getAllCarNotOnPolicyCheckLists();
    }

    @GetMapping("/claims/{id}")
    public CarNotOnPolicyCheckList getCarNotOnPolicyChecklistByClaimId(@PathVariable int id) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(id).orElseThrow(IllegalArgumentException::new);
        return carNotOnPolicyCheckList;
    }
    @GetMapping("/{id}")
    public CarNotOnPolicyCheckList getOneCarNotOnPolicyCheckList(@PathVariable int id) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(id).orElseThrow(IllegalArgumentException::new);
        return carNotOnPolicyCheckList;
    }

    @PostMapping("/{claim_id}")
    public CarNotOnPolicyCheckList addOneCarNotOnPolicyCheckList(@RequestBody CarNotOnPolicyCheckList newCarNotOnPolicyCheckList, @PathVariable int claim_id) {
//        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(newCarNotOnPolicyCheckList.getId()).orElseThrow(IllegalArgumentException::new);
        Claim claim = this.claimsService.getOneClaim(claim_id).orElseThrow(IllegalArgumentException::new);
        newCarNotOnPolicyCheckList.setClaim(claim);
        return carNotOnPolicyCheckListsService.addOneCarNotOnPolicyCheckList(newCarNotOnPolicyCheckList);
    }

//    @PostMapping("/{claim_id}")
//    public CarNotOnPolicyCheckList addOneCarNotOnPolicyCheckList(@RequestBody CarNotOnPolicyCheckList newCarNotOnPolicyCheckList) {
//        if (newCarNotOnPolicyCheckList.getCall_member() == null || newCarNotOnPolicyCheckList.getClaimant_letter() == null || newCarNotOnPolicyCheckList.getFinal_letterMember() == null)
//            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " + "before API call is made.");
//
//
//        return carNotOnPolicyCheckListsService.addOneCarNotOnPolicyCheckList(newCarNotOnPolicyCheckList);

//    }

    @PatchMapping("/{claim_id}")
    public CarNotOnPolicyCheckList updateOneCarNotOnPolicyCheckList(@RequestBody CarNotOnPolicyCheckList updatedCarNotOnPolicyCheckList, @PathVariable int claim_id) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(updatedCarNotOnPolicyCheckList.getId()).orElseThrow(IllegalArgumentException::new);
        Claim claim = this.claimsService.getOneClaim(claim_id).orElseThrow(IllegalArgumentException::new);
        updatedCarNotOnPolicyCheckList.setClaim(claim);
        return carNotOnPolicyCheckListsService.updateOneCarNotOnPolicyCheckList(updatedCarNotOnPolicyCheckList);
    }

    @DeleteMapping("/{id}")
    public String removeOneCarNotOnPolicyCheckList(@PathVariable int id) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(id).orElseThrow(IllegalArgumentException::new);
        return carNotOnPolicyCheckListsService.removeOneCarNotOnPolicyCheckList(id);
    }

}
