package ru.dzgeorgy.domain.repositories

import androidx.paging.PagingSource
import ru.dzgeorgy.domain.entities.Word

interface WordsRepository {

    suspend fun save(word: Word)

    suspend fun get(word: String): Word?

    fun getAlphabetically(pageSize: Int, page: Int): PagingSource<Int, Word>

    suspend fun delete(word: Word)

}