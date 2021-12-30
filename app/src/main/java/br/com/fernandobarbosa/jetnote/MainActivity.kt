package br.com.fernandobarbosa.jetnote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import br.com.fernandobarbosa.jetnote.data.NoteDataSource
import br.com.fernandobarbosa.jetnote.model.Note
import br.com.fernandobarbosa.jetnote.screens.NoteScreen
import br.com.fernandobarbosa.jetnote.ui.theme.JetNoteTheme

@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteTheme {
                val notes = remember {
                    mutableStateListOf<Note>()
                }
                Surface(color = MaterialTheme.colors.background) {
                    NoteScreen(
                        notes = notes,
                        onAddNote = {
                            notes.add(it)
                        },
                        onRemoveNote = {
                            notes.remove(it)
                        }
                    )
                }
            }
        }
    }
}