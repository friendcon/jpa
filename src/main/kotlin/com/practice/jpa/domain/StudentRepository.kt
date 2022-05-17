package com.practice.jpa.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query

interface StudentRepository : JpaRepository<Student, Long> {
}