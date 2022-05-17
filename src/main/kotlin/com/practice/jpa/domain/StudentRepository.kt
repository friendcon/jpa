package com.practice.jpa.domain

import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, Long> {
}