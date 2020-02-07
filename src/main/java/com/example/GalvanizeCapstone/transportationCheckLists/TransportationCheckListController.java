package com.example.GalvanizeCapstone.transportationCheckLists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transportationCheckList")
public class TransportationCheckListController {
    @Autowired
    private final TransportationCheckListService transportationCheckListService;

    public TransportationCheckListController(TransportationCheckListService transportationCheckListService) {
        this.transportationCheckListService = transportationCheckListService;
    }
    @GetMapping
    public List<TransportationCheckList> getAllTransportationCheckLists() {
        return this.transportationCheckListService.getAllTransportationCheckLists();
    }
    @GetMapping("/{id}")
    public TransportationCheckList getOneTransportationCheckList(@PathVariable int id) {
        TransportationCheckList transportationCheckList = transportationCheckListService.getOneTransportationCheckList(id).orElseThrow(IllegalArgumentException::new);
        return transportationCheckList;
    }
    public TransportationCheckList addOneTransportationCheckList(@RequestBody TransportationCheckList newTransportationCheckList) {
        if(newTransportationCheckList.getCall() == null || newTransportationCheckList.getLetter() == null || newTransportationCheckList.getClaimant_call() == null ||newTransportationCheckList.getClaimant_letter() == null) {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " + "before API call is made.");

    }
        return transportationCheckListService.addOneTransportationCheckList(newTransportationCheckList);


}
