package com.example.jetpackcomposenoteapp.domain.use_case

import com.example.jetpackcomposenoteapp.domain.model.InvalidNoteException
import com.example.jetpackcomposenoteapp.domain.model.Note
import com.example.jetpackcomposenoteapp.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        if (note.timestamp <= 0) {
            throw InvalidNoteException("A valid date must be selected.")
        }
        repository.insertNote(note)
    }
}
