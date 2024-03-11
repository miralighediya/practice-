package com.example.practis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practis.entity.entitydata;

public interface DataRepository extends JpaRepository<entitydata,Long> {

}
