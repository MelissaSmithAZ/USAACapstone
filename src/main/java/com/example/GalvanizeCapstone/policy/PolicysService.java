package com.example.GalvanizeCapstone.policy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PolicysService {
    @Autowired
    private final PolicysRepository policysRepository;

    public PolicysService(PolicysRepository policysRepository) {
        this.policysRepository = policysRepository;
    }
    public List<Policy> getAllPolicys() {
        return this.policysRepository.findAll();
    }
    //when you put the <> it is the generic type
    public Optional<Policy> getOnePolicy(int id) {
        return policysRepository.findById(id);
    }
    public Policy addOnePolicy(Policy newPolicy) {
        return policysRepository.save(newPolicy);
    }
    public Policy updateOnePolicy(Policy updatedPolicy) {
        return policysRepository.save(updatedPolicy);
    }
    public String removeOnePolicy(int id) {
        policysRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}
