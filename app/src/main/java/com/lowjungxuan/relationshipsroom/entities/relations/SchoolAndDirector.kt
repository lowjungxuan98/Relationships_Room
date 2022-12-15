package com.lowjungxuan.relationshipsroom.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.lowjungxuan.relationshipsroom.entities.Director
import com.lowjungxuan.relationshipsroom.entities.School

//TODO: One to One
data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName", // this refer from the school
        entityColumn = "schoolName" // this refer from the director
    )
    val director: Director
)
