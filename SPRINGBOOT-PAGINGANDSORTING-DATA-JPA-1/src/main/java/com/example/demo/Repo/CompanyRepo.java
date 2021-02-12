package com.example.demo.Repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.CompanyDto;

@Repository
public interface CompanyRepo extends PagingAndSortingRepository<CompanyDto, Integer> {

}
