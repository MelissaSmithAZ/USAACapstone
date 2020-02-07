package com.example.GalvanizeCapstone.transportationCheckLists;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransportationCheckListService {
    @Autowired

    private final TransportationCheckListRepository transportationCheckListRepository;

    public TransportationCheckListService(TransportationCheckListRepository transportationCheckListRepository) {
        this.transportationCheckListRepository = transportationCheckListRepository;
    }
    public List<TransportationCheckList> getAllTransportationCheckLists() {
        return this.transportationCheckListRepository.findAll();
    }
    public Optional<TransportationCheckList> getOneTransportationCheckList(int id) {
        return transportationCheckListRepository.findById(id);
    }
    public TransportationCheckList updateOneTransportationCheckList(TransportationCheckList updatedTransportationCheckList) {
        return transportationCheckListRepository.save(updatedTransportationCheckList);
    }
    public String removeOneTransportationCheckList(int id) {
        transportationCheckListRepository.deleteById(id);
        return "id " + id + " was removed";
    }
}
