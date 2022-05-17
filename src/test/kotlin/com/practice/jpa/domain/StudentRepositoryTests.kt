package com.practice.jpa.domain

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StudentRepositoryTests(
    @Autowired private val studentRepository: StudentRepository
) {
    @Test
    fun 학생CREATE() {
        val student: Student = Student(1, "hozumi", "hozumi@gmail.com")
        studentRepository.save(student)
    }

    @Test
    fun 존재하는학생_Read() {
        val student: Student = Student(1, "hozumi", "hozumi@gmail.com")
        studentRepository.save(student)
        val student2 = studentRepository.findById(student.studentId)

        if(student2.isPresent) {
            val st = student2.get()
            println("***** 학생정보출력 *****")
            println(" ${st.studentId} : ${st.studentName} : ${st.studentEmail}")
        } else {
            throw NoSuchElementException("학생정보가 존재하지 않습니다")
        }
    }
}