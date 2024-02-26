package com.utkarsh.crud.repository;

import com.utkarsh.crud.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {
}
