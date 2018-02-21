package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Notes;

/**
 * @author JThakur
 *
 */
public interface INoteRepository extends JpaRepository<Notes, Integer> {
}
