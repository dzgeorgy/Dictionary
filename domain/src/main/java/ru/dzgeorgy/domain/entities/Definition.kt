package ru.dzgeorgy.domain.entities

data class Definition(
    val noun: List<String> = emptyList(),
    val adjective: List<String> = emptyList(),
    val verb: List<String> = emptyList(),
    val adverb: List<String> = emptyList(),
)
