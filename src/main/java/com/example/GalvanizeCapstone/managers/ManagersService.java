package com.example.GalvanizeCapstone.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagersService {
    @Autowired
    private final ManagersRepository managersRepository;

    public ManagersService(ManagersRepository managersRepository) {
        this.managersRepository = managersRepository;
    }
    public List<Manager> getAllManagers() {
        return this.managersRepository.findAll();
    }
    //when you put the <> it is the generic type
    public Optional<Manager> getOneManager(int id) {
        return managersRepository.findById(id);
    }
    public Manager addOneManager(Manager newManager) {
        return managersRepository.save(newManager);
    }
    public Manager updateOneManager(Manager updatedManager) {
        return managersRepository.save(updatedManager);
    }
    public String removeOneManager(int id) {
        managersRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}
