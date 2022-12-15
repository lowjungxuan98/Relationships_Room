package com.lowjungxuan.relationshipsroom.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.lowjungxuan.relationshipsroom.entities.School
import com.lowjungxuan.relationshipsroom.entities.Student

//TODO: One to N
data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName", // this refer from the school
        entityColumn = "schoolName" // this refer from the student
    )
    val students: List<Student>
)