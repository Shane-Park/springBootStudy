package com.shane.boot.repositories;

import com.shane.boot.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Member, Long>{
    public Member findById(long id);
}
