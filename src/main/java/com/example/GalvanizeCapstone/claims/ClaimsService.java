package com.example.GalvanizeCapstone.claims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ClaimsService {

    @Autowired
    private final ClaimsRepository claimsRepository;

    public ClaimsService(ClaimsRepository claimsRepository) {
        this.claimsRepository = claimsRepository;
    }
    public List<Claim> getAllClaims() {
        return this.claimsRepository.findAll();
    }
    //when you put the <> it is the generic type
    public Optional<Claim> getOneClaim(int id) {
        return claimsRepository.findById(id);
    }
    public Claim addOneClaim(Claim newClaim) {
        return claimsRepository.save(newClaim);
    }
    public Claim updateOneClaim(Claim updatedClaim) {
        return claimsRepository.save(updatedClaim);
    }
    public String removeOneClaim(int id) {
        claimsRepository.deleteById(id);
        return "Id " + id + " was removed";
    }


}
