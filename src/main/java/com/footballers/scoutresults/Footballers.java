package com.footballers.scoutresults;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Footballers")
public class Footballers {
    @Id
    @GeneratedValue
    public int id;
    public int age;
    public String name;
    public String club;
    public String nation;
    public int jersey_number;
    Footballers(){

    }
    Footballers(int id,int age,String name,String club,String nation,int jersey_number){
        this.id=id;
        this.age=age;
        this.name=name;
        this.club=club;
        this.nation=nation;
        this.jersey_number=jersey_number;
    }
//    public void setId(int id){
//        this.id=id;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setClub(String club) {
//        this.club = club;
//    }
//
//    public void setNation(String nation) {
//        this.nation = nation;
//    }
//
//    public void setJersey_number(int jersey_number) {
//        this.jersey_number = jersey_number;
//    }
}
