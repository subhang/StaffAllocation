package com.example.management;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Integer> {


}
