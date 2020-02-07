package com.example.GalvanizeCapstone.coverageCheckLists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coverageCheckList")
public class coverageCheckListController {

    @Autowired
    private final CoverageCheckListService coverageCheckListService;

    public coverageCheckListController(CoverageCheckListService coverageCheckListService) {
        this.coverageCheckListService = coverageCheckListService;
    }

    @GetMapping
    public List<CoverageCheckList> getAllCoverageCheckLists() {
        return this.coverageCheckListService.getAllCoverageCheckLists();
    }

    @GetMapping("/{id}")
    public CoverageCheckList getOneCoverageCheckList(@PathVariable int id) {
        CoverageCheckList coverageCheckList = coverageCheckListService.getOneCoverageCheckList(id).orElseThrow(IllegalArgumentException::new);
        return coverageCheckList;
    }

    @PostMapping
    public CoverageCheckList addOneCoverageCheckList(@RequestBody CoverageCheckList newCoverageCheckList) {
        if(newCoverageCheckList.getCarNotOnPolicy() == null || newCoverageCheckList.getRor() == null || newCoverageCheckList.getTransportation() == null || newCoverageCheckList.getLimits() == null) {
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return coverageCheckListService.addOneCoverageCheckList(newCoverageCheckList);
    }

    @PatchMapping
    public CoverageCheckList updateOneCoverageCheckList(@RequestBody CoverageCheckList updatedCoverageCheckList) {
        CoverageCheckList coverageCheckList = coverageCheckListService.getOneCoverageCheckList(updatedCoverageCheckList.getId()).orElseThrow(IllegalArgumentException::new);
        return coverageCheckListService.updateOneCoverageCheckList(updatedCoverageCheckList);
    }

    @DeleteMapping("/{id}")
    public String removeOneCoverageCheckList(@PathVariable int id) {
        CoverageCheckList coverageCheckList = coverageCheckListService.getOneCoverageCheckList(id).orElseThrow(IllegalArgumentException::new);
        return coverageCheckListService.removeOneCoverageCheckList(id);
    }

}
