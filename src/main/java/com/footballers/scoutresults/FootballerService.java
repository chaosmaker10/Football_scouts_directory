package com.footballers.scoutresults;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FootballerService {
    FootballerRepository repo;

    FootballerService(FootballerRepository repo){
        this.repo=repo;
    }
    public List<Footballers> getAll() {
        return repo.findAll();
    }
    public Optional<Footballers> getById(int id){
        return repo.findById(id);
    }
    public String add(Footballers footballer){
           repo.save(footballer);
           return "Added successfully";
    }
    public String deleteById(int id){
        repo.deleteById(id);
        return "deletion Completed";
    }
    public String update(int id,Footballers football){
        Optional<Footballers> footballer=repo.findById(id);
        repo.deleteById(id);
        repo.save(football);
        return "updated";
    }
}
