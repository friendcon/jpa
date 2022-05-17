package com.practice.jpa.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Table
@Entity
class Student(
    @Id @GeneratedValue val studentId: Long,
    val studentName: String,
    var studentEmail: String
) {
    // 이메일 수정 메서드
    fun updateEmail(studentEmail: String) = apply {
        this.studentEmail = studentEmail
    }
}