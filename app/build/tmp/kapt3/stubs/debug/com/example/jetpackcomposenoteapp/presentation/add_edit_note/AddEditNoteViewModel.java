package com.example.jetpackcomposenoteapp.presentation.add_edit_note;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel;", "Landroidx/lifecycle/ViewModel;", "notesUseCases", "Lcom/example/jetpackcomposenoteapp/domain/use_case/NotesUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/jetpackcomposenoteapp/domain/use_case/NotesUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent;", "_noteColor", "Landroidx/compose/runtime/MutableState;", "", "_noteContent", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/NoteTextFieldState;", "_noteTitle", "currentNoteId", "Ljava/lang/Integer;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "noteColor", "Landroidx/compose/runtime/State;", "getNoteColor", "()Landroidx/compose/runtime/State;", "noteContent", "getNoteContent", "noteTitle", "getNoteTitle", "onEvent", "", "event", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteEvent;", "UiEvent", "app_debug"})
public final class AddEditNoteViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.jetpackcomposenoteapp.domain.use_case.NotesUseCases notesUseCases = null;
    private final androidx.compose.runtime.MutableState<com.example.jetpackcomposenoteapp.presentation.add_edit_note.NoteTextFieldState> _noteTitle = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.jetpackcomposenoteapp.presentation.add_edit_note.NoteTextFieldState> noteTitle = null;
    private final androidx.compose.runtime.MutableState<com.example.jetpackcomposenoteapp.presentation.add_edit_note.NoteTextFieldState> _noteContent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.jetpackcomposenoteapp.presentation.add_edit_note.NoteTextFieldState> noteContent = null;
    private final androidx.compose.runtime.MutableState<java.lang.Integer> _noteColor = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<java.lang.Integer> noteColor = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.SharedFlow<com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent> eventFlow = null;
    private java.lang.Integer currentNoteId;
    
    @javax.inject.Inject
    public AddEditNoteViewModel(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.domain.use_case.NotesUseCases notesUseCases, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.jetpackcomposenoteapp.presentation.add_edit_note.NoteTextFieldState> getNoteTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.jetpackcomposenoteapp.presentation.add_edit_note.NoteTextFieldState> getNoteContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<java.lang.Integer> getNoteColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.SharedFlow<com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteEvent event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent;", "", "()V", "SaveNote", "ShowSnackBar", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent$ShowSnackBar;", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent$SaveNote;", "app_debug"})
    public static abstract class UiEvent {
        
        private UiEvent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent$ShowSnackBar;", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class ShowSnackBar extends com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String message = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent.ShowSnackBar copy(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public ShowSnackBar(@org.jetbrains.annotations.NotNull
            java.lang.String message) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getMessage() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent$SaveNote;", "Lcom/example/jetpackcomposenoteapp/presentation/add_edit_note/AddEditNoteViewModel$UiEvent;", "()V", "app_debug"})
        public static final class SaveNote extends com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent {
            @org.jetbrains.annotations.NotNull
            public static final com.example.jetpackcomposenoteapp.presentation.add_edit_note.AddEditNoteViewModel.UiEvent.SaveNote INSTANCE = null;
            
            private SaveNote() {
                super();
            }
        }
    }
}