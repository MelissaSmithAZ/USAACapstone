package com.example.GalvanizeCapstone.transportationCheckLists;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportationCheckListsRepository extends JpaRepository<TransportationCheckList, Integer> {
    TransportationCheckList findByClaimId(int claim_id);
}
