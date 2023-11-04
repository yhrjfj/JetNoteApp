package com.yhr.jfj.jetnote.navigation

import java.lang.IllegalArgumentException

enum class NoteScreen {
    MainScreen,
    AddNoteScreen,
    StoreNoteScreen;

    companion object {
        fun fromRoute(route: String): NoteScreen = when (route.substringBefore("/")) {
            MainScreen.name -> MainScreen
            AddNoteScreen.name -> AddNoteScreen
            StoreNoteScreen.name -> StoreNoteScreen
            else -> throw IllegalArgumentException("Route is not recognized")
        }
    }
}