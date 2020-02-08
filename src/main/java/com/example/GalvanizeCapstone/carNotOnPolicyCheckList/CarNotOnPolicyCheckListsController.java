package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import com.example.GalvanizeCapstone.transportationCheckLists.TransportationCheckList;
import com.example.GalvanizeCapstone.transportationCheckLists.TransportationCheckListsService;
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
    public TransportationCheckList getOneTransportationCheckList(@PathVariable int id) {
        TransportationCheckList transportationCheckList = transportationCheckListsService.getOneTransportationCheckList(id).orElseThrow(IllegalArgumentException::new);
        return transportationCheckList;
    }
    @PostMapping
    public TransportationCheckList addOneTransportationCheckList(@RequestBody TransportationCheckList newTransportationCheckList) {
        if (newTransportationCheckList.getCall() == null || newTransportationCheckList.getLetter() == null || newTransportationCheckList.getClaimant_call() == null || newTransportationCheckList.getClaimant_letter() == null)
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " + "before API call is made.");


        return transportationCheckListsService.addOneTransportationCheckList(newTransportationCheckList);

    }

}
