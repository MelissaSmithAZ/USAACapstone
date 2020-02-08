package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarNotOnPolicyCheckListsService {
    @Autowired

    private final CarNotOnPolicyCheckListsRepository carNotOnPolicyCheckListsRepository;

    public CarNotOnPolicyCheckListsService(CarNotOnPolicyCheckListsRepository carNotOnPolicyCheckListsRepository) {
        this.carNotOnPolicyCheckListsRepository = carNotOnPolicyCheckListsRepository;
    }
    public List<CarNotOnPolicyCheckList> getAllCarNotOnPolicyCheckLists() {
        return this.carNotOnPolicyCheckListsRepository.findAll();
    }
    public Optional<CarNotOnPolicyCheckList> getOneCarNotOnPolicyCheckList(int id) {
        return carNotOnPolicyCheckListsRepository.findById(id);
    }
    public CarNotOnPolicyCheckList addOneCarNotOnPolicyCheckList(CarNotOnPolicyCheckList newCarNotOnPolicyCheckList){
        return carNotOnPolicyCheckListsRepository.save(newCarNotOnPolicyCheckList);
    }
    public CarNotOnPolicyCheckList updateOneCarNotOnPolicyCheckList(CarNotOnPolicyCheckList updatedCarNotOnPolicyCheckList) {
        return carNotOnPolicyCheckListsRepository.save(updatedCarNotOnPolicyCheckList);
    }
    public String removeOneCarNotOnPolicyCheckList(int id) {
        carNotOnPolicyCheckListsRepository.deleteById(id);
        return "id " + id + " was removed";
    }
}
