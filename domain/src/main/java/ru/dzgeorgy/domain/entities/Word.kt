package ru.dzgeorgy.domain.entities

data class Word(
    val word: String,
    val definition: Definition,
    val example: List<String>,
    val references: List<String>
)