package com.example.jetpackcomposenoteapp.domain.use_case;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/jetpackcomposenoteapp/domain/use_case/GetNotes;", "", "repository", "Lcom/example/jetpackcomposenoteapp/domain/repository/NoteRepository;", "(Lcom/example/jetpackcomposenoteapp/domain/repository/NoteRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/jetpackcomposenoteapp/domain/model/Note;", "noteOrder", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder;", "app_debug"})
public final class GetNotes {
    private final com.example.jetpackcomposenoteapp.domain.repository.NoteRepository repository = null;
    
    public GetNotes(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.domain.repository.NoteRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.jetpackcomposenoteapp.domain.model.Note>> invoke(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.domain.util.NoteOrder noteOrder) {
        return null;
    }
}