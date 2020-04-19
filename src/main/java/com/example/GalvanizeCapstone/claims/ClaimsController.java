package com.example.GalvanizeCapstone.claims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("claims")
public class ClaimsController {
    @Autowired
    private final ClaimsService claimsService;

    private final EntityManager entityManager;

    public ClaimsController(ClaimsService claimsService, EntityManager entityManager) {
        this.claimsService = claimsService;
        this.entityManager = entityManager;
    }

    @GetMapping
    public List<Claim> getAllClaims() {
        return  this.claimsService.getAllClaims();
    }

    @GetMapping("/{id}")
    public Claim getOneClaim(@PathVariable int id) {
        Claim claim = claimsService.getOneClaim(id).orElseThrow(IllegalArgumentException::new);
        return claim;
    }

    @PostMapping
    public Claim addOneClaim(@RequestBody Claim newClaim) {
        if (newClaim.getClaimant_name() == null || newClaim.getClaimant_address() == null || newClaim.getClaimant_email() == null || newClaim.getClaimant_phone() == null || newClaim.getOccurrence_state() == null || newClaim.getClaimant_auto() == null ){
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return claimsService.addOneClaim(newClaim);
    }

    @PatchMapping
    public Claim updateOneClaim(@RequestBody Claim updatedClaim) {
        Claim claim = claimsService.getOneClaim(updatedClaim.getId()).orElseThrow(IllegalArgumentException::new);
        return claimsService.updateOneClaim(updatedClaim);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public String removeOneClaim(@PathVariable int id) {
        Query q1 = entityManager.createNativeQuery("delete from transportation_check_list  where claim_id = ?");
        q1.setParameter(1, id);
//        entityManager.joinTransaction();
        q1.executeUpdate();

        Query q2 = entityManager.createNativeQuery("delete from car_not_on_policy_check_list  where claim_id = ?");
        q2.setParameter(1, id);
//        entityManager.joinTransaction();
        q2.executeUpdate();

//        Claim claim = claimsService.getOneClaim(id).orElseThrow(IllegalArgumentException::new);
        return claimsService.removeOneClaim(id);
    }


}
