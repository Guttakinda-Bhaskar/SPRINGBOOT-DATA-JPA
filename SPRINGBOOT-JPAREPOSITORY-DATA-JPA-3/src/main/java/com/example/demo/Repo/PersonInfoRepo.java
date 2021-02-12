package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Person;

@Repository
public interface PersonInfoRepo extends JpaRepository<Person, Integer> {

}
