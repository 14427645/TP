package com.example.jetpackcomposenoteapp.presentation.notes;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/jetpackcomposenoteapp/presentation/notes/NotesViewModel;", "Landroidx/lifecycle/ViewModel;", "notesUseCases", "Lcom/example/jetpackcomposenoteapp/domain/use_case/NotesUseCases;", "(Lcom/example/jetpackcomposenoteapp/domain/use_case/NotesUseCases;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/jetpackcomposenoteapp/presentation/notes/NotesState;", "getNotesJob", "Lkotlinx/coroutines/Job;", "recentlyDeletedNote", "Lcom/example/jetpackcomposenoteapp/domain/model/Note;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getNotes", "", "noteOrder", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder;", "onEvent", "event", "Lcom/example/jetpackcomposenoteapp/presentation/notes/NotesEvent;", "app_debug"})
public final class NotesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.jetpackcomposenoteapp.domain.use_case.NotesUseCases notesUseCases = null;
    private final androidx.compose.runtime.MutableState<com.example.jetpackcomposenoteapp.presentation.notes.NotesState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.jetpackcomposenoteapp.presentation.notes.NotesState> state = null;
    private com.example.jetpackcomposenoteapp.domain.model.Note recentlyDeletedNote;
    private kotlinx.coroutines.Job getNotesJob;
    
    @javax.inject.Inject
    public NotesViewModel(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.domain.use_case.NotesUseCases notesUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.jetpackcomposenoteapp.presentation.notes.NotesState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.presentation.notes.NotesEvent event) {
    }
    
    private final void getNotes(com.example.jetpackcomposenoteapp.domain.util.NoteOrder noteOrder) {
    }
}