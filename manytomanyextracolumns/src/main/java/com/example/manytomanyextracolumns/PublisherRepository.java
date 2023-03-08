package com.example.manytomanyextracolumns;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.concurrent.Flow;

public interface PublisherRepository extends JpaRepository<Flow.Publisher,Integer> {
}