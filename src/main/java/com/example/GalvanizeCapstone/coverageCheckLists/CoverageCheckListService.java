//package com.example.GalvanizeCapstone.coverageCheckLists;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CoverageCheckListService {
//    @Autowired
//    private final CoverageCheckListRepository coverageCheckListRepository;
//
//    public CoverageCheckListService(CoverageCheckListRepository coverageCheckListRepository) {
//        this.coverageCheckListRepository = coverageCheckListRepository;
//    }
//
//    public List<CoverageCheckList> getAllCoverageCheckLists() {
//        return this.coverageCheckListRepository.findAll();
//    }
//
//    public Optional<CoverageCheckList> getOneCoverageCheckList(int id) {
//        return coverageCheckListRepository.findById(id);
//    }
//
//    public CoverageCheckList addOneCoverageCheckList(CoverageCheckList newCoverageCheckList) {
//        return coverageCheckListRepository.save(newCoverageCheckList);
//    }
//
//    public CoverageCheckList updateOneCoverageCheckList(CoverageCheckList updatedCoverageCheckList) {
//        return coverageCheckListRepository.save(updatedCoverageCheckList);
//    }

//    public String removeOneCoverageCheckList(int id) {
//        coverageCheckListRepository.deleteById(id);
//        return "Id " + id + " was removed";
//    }
//}
