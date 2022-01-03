package br.com.fernandobarbosa.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.fernandobarbosa.jetnote.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}