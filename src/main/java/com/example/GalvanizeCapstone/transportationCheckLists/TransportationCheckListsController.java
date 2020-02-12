package com.example.GalvanizeCapstone.transportationCheckLists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("transportationCheckList")
public class TransportationCheckListsController {
    @Autowired
    private final TransportationCheckListsService transportationCheckListsService;

    public TransportationCheckListsController(TransportationCheckListsService transportationCheckListsService) {
        this.transportationCheckListsService = transportationCheckListsService;
    }
    @GetMapping
    public List<TransportationCheckList> getAllTransportationCheckLists() {
        return this.transportationCheckListsService.getAllTransportationCheckLists();
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
    @PatchMapping
    public TransportationCheckList updateOneTransportationCheckList(@RequestBody TransportationCheckList updatedTransportationCheckList) {
        TransportationCheckList transportationCheckList = transportationCheckListsService.getOneTransportationCheckList(updatedTransportationCheckList.getId()).orElseThrow(IllegalArgumentException::new);
        return transportationCheckListsService.updateOneTransportationCheckList(updatedTransportationCheckList);
    }

    @DeleteMapping("/{id}")
    public String removeOneTransportationCheckList(@PathVariable int id) {
        TransportationCheckList transportationCheckList = transportationCheckListsService.getOneTransportationCheckList(id).orElseThrow(IllegalArgumentException::new);
        return transportationCheckListsService.removeOneTransportationCheckList(id);
    }
}
