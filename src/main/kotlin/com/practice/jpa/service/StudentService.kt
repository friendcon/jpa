package com.practice.jpa.service

import com.practice.jpa.domain.StudentRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    private val studentRepository: StudentRepository
) {
    fun create() {

    }
}