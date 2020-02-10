package com.example.GalvanizeCapstone.managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("managers")
public class ManagersController {
    @Autowired
    private final ManagersService managersService;

    public ManagersController(ManagersService managersService) {
        this.managersService = managersService;
    }

    @GetMapping
    public List<Manager> getAllManagers() {
        return  this.managersService.getAllManagers();
    }

    @GetMapping("/{id}")
    public Manager getOneManager(@PathVariable int id) {
        Manager manager = managersService.getOneManager(id).orElseThrow(IllegalArgumentException::new);
        return manager;
    }

    @PostMapping
    public Manager addOneManager(@RequestBody Manager newManager) {
        if (newManager.getManager_name() == null || newManager.getManager_employee_number() < 0 ){
            throw new IllegalArgumentException("Not all fields are valid. Go back and make sure all fields are valid " +
                    "before API call is made.");
        }
        return managersService.addOneManager(newManager);
    }

    @PatchMapping
    public Manager updateOneManager(@RequestBody Manager updatedManager) {
        Manager manager = managersService.getOneManager(updatedManager.getId()).orElseThrow(IllegalArgumentException::new);
        return managersService.updateOneManager(updatedManager);
    }

    @DeleteMapping("/{id}")
    public String removeOneManager(@PathVariable int id) {
        Manager manager = managersService.getOneManager(id).orElseThrow(IllegalArgumentException::new);
        return managersService.removeOneManager(id);
    }
}
