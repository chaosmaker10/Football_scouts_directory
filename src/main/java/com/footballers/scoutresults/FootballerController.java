package com.footballers.scoutresults;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FootballerController {
    FootballerService service;
    FootballerController(FootballerService service){
        this.service=service;
    }
//    To get things from table
    @GetMapping("/get")
    public List<Footballers> getAll() {
        return service.getAll();
    }
    @GetMapping("/byid")
    public Optional<Footballers> byId(int id){
        return service.getById(id);
    }
//    To post things in sql
    @PostMapping("/add")
    public String add(@RequestBody Footballers football){
        return service.add(football);
    }
//  to delete things in table
    @DeleteMapping("/delete")
    public String todelete(int id){
        return service.deleteById(id);
    }
// to update stuff in table
    @PutMapping("/update")
    public String toupdate(int id,@RequestBody Footballers football){
        return service.update(football.id,football);
    }
}
