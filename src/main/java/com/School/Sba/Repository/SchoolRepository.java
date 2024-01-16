package com.School.Sba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.School.Sba.Entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {

}
