package com.example.GalvanizeCapstone.transportationCheckLists;

import com.example.GalvanizeCapstone.claims.Claim;
import com.example.GalvanizeCapstone.claims.ClaimsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("transportationCheckList")
public class TransportationCheckListsController {
    @Autowired
    private final TransportationCheckListsService transportationCheckListsService;

    @Autowired
    private  final ClaimsService claimsService;
    public TransportationCheckListsController(TransportationCheckListsService transportationCheckListsService, ClaimsService claimsService) {
        this.transportationCheckListsService = transportationCheckListsService;
        this.claimsService = claimsService;
    }
    @GetMapping
    public List<TransportationCheckList> getAllTransportationCheckLists() {
        return this.transportationCheckListsService.getAllTransportationCheckLists();
    }
    @GetMapping("/claims/{id}")
    public TransportationCheckList getTransportationChecklistByClaimId(@PathVariable int id) {
        TransportationCheckList transportationCheckList = transportationCheckListsService.getOneTransportationCheckList(id).orElseThrow(IllegalArgumentException::new);
        return transportationCheckList;
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
    @PatchMapping("/{claim_id}")
    public TransportationCheckList updateOneTransportationCheckList(@RequestBody TransportationCheckList updatedTransportationCheckList, @PathVariable int claim_id) {
        TransportationCheckList transportationCheckList = transportationCheckListsService.getOneTransportationCheckList(updatedTransportationCheckList.getId()).orElseThrow(IllegalArgumentException::new);
        Claim claim = this.claimsService.getOneClaim(claim_id).orElseThrow(IllegalArgumentException::new);
        updatedTransportationCheckList.setClaim(claim);
        return transportationCheckListsService.updateOneTransportationCheckList(updatedTransportationCheckList);
    }

    @DeleteMapping("/{id}")
    public String removeOneTransportationCheckList(@PathVariable int id) {
        TransportationCheckList transportationCheckList = transportationCheckListsService.getOneTransportationCheckList(id).orElseThrow(IllegalArgumentException::new);
        return transportationCheckListsService.removeOneTransportationCheckList(id);
    }
}
