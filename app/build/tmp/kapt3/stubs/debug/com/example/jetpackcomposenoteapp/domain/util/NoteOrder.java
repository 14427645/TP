package com.example.jetpackcomposenoteapp.domain.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder;", "", "orderType", "Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;", "(Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;)V", "getOrderType", "()Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;", "copy", "Color", "Date", "Title", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder$Title;", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder$Date;", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder$Color;", "app_debug"})
public abstract class NoteOrder {
    @org.jetbrains.annotations.NotNull
    private final com.example.jetpackcomposenoteapp.domain.util.OrderType orderType = null;
    
    private NoteOrder(com.example.jetpackcomposenoteapp.domain.util.OrderType orderType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.jetpackcomposenoteapp.domain.util.OrderType getOrderType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.jetpackcomposenoteapp.domain.util.NoteOrder copy(@org.jetbrains.annotations.NotNull
    com.example.jetpackcomposenoteapp.domain.util.OrderType orderType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder$Title;", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder;", "orderType", "Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;", "(Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;)V", "app_debug"})
    public static final class Title extends com.example.jetpackcomposenoteapp.domain.util.NoteOrder {
        
        public Title(@org.jetbrains.annotations.NotNull
        com.example.jetpackcomposenoteapp.domain.util.OrderType orderType) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder$Date;", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder;", "orderType", "Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;", "(Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;)V", "app_debug"})
    public static final class Date extends com.example.jetpackcomposenoteapp.domain.util.NoteOrder {
        
        public Date(@org.jetbrains.annotations.NotNull
        com.example.jetpackcomposenoteapp.domain.util.OrderType orderType) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder$Color;", "Lcom/example/jetpackcomposenoteapp/domain/util/NoteOrder;", "orderType", "Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;", "(Lcom/example/jetpackcomposenoteapp/domain/util/OrderType;)V", "app_debug"})
    public static final class Color extends com.example.jetpackcomposenoteapp.domain.util.NoteOrder {
        
        public Color(@org.jetbrains.annotations.NotNull
        com.example.jetpackcomposenoteapp.domain.util.OrderType orderType) {
            super(null);
        }
    }
}