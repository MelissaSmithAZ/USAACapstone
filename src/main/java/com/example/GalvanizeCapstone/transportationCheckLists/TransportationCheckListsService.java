package com.example.GalvanizeCapstone.transportationCheckLists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportationCheckListsService {
    @Autowired

    private final TransportationCheckListsRepository transportationCheckListsRepository;

    public TransportationCheckListsService(TransportationCheckListsRepository transportationCheckListsRepository) {
        this.transportationCheckListsRepository = transportationCheckListsRepository;
    }
    public List<TransportationCheckList> getAllTransportationCheckLists() {
        return this.transportationCheckListsRepository.findAll();
    }
    public TransportationCheckList getTransportationChecklistByClaimId(int id) {
        return transportationCheckListsRepository.findByClaimId(id);
    }
    public Optional<TransportationCheckList> getOneTransportationCheckList(int id) {
        return transportationCheckListsRepository.findById(id);
    }
    public TransportationCheckList addOneTransportationCheckList(TransportationCheckList newTransportationCheckList){
        return transportationCheckListsRepository.save(newTransportationCheckList);
    }
    public TransportationCheckList updateOneTransportationCheckList(TransportationCheckList updatedTransportationCheckList) {
        return transportationCheckListsRepository.save(updatedTransportationCheckList);
    }
    public String removeOneTransportationCheckList(int id) {
        transportationCheckListsRepository.deleteById(id);
        return "id " + id + " was removed";
    }
}
