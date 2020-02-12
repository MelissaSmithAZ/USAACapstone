package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carNotOnPolicyCheckList")

public class CarNotOnPolicyCheckListsController {
    @Autowired
    private final CarNotOnPolicyCheckListsService carNotOnPolicyCheckListsService;

    public CarNotOnPolicyCheckListsController(CarNotOnPolicyCheckListsService carNotOnPolicyCheckListsService) {
        this.carNotOnPolicyCheckListsService = carNotOnPolicyCheckListsService;
    }
    @GetMapping
    public List<CarNotOnPolicyCheckList> getAllCarNotOnPolicyCheckLists() {
        return this.carNotOnPolicyCheckListsService.getAllCarNotOnPolicyCheckLists();
    }
    @GetMapping("/{id}")
    public CarNotOnPolicyCheckList getOneCarNotOnPolicyCheckList(@PathVariable int id) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(id).orElseThrow(IllegalArgumentException::new);
        return carNotOnPolicyCheckList;
    }
    @PostMapping
    public CarNotOnPolicyCheckList addOneCarNotOnPolicyCheckList(@RequestBody CarNotOnPolicyCheckList newCarNotOnPolicyCheckList) {
        if (newCarNotOnPolicyCheckList.getCallMember() == null || newCarNotOnPolicyCheckList.getRentalAgreement() == null || newCarNotOnPolicyCheckList.getClaimant_letter() == null || newCarNotOnPolicyCheckList.getFinal_letterMember() == null)
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " + "before API call is made.");


        return carNotOnPolicyCheckListsService.addOneCarNotOnPolicyCheckList(newCarNotOnPolicyCheckList);

    }

    @PatchMapping
    public CarNotOnPolicyCheckList updateOneCarNotOnPolicyCheckList(@RequestBody CarNotOnPolicyCheckList updatedCarNotOnPolicyCheckList) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(updatedCarNotOnPolicyCheckList.getId()).orElseThrow(IllegalArgumentException::new);
        return carNotOnPolicyCheckListsService.updateOneCarNotOnPolicyCheckList(updatedCarNotOnPolicyCheckList);
    }

    @DeleteMapping("/{id}")
    public String removeOneCarNotOnPolicyCheckList(@PathVariable int id) {
        CarNotOnPolicyCheckList carNotOnPolicyCheckList = carNotOnPolicyCheckListsService.getOneCarNotOnPolicyCheckList(id).orElseThrow(IllegalArgumentException::new);
        return carNotOnPolicyCheckListsService.removeOneCarNotOnPolicyCheckList(id);
    }

}
