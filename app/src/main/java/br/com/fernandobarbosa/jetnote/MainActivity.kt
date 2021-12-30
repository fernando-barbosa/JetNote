package br.com.fernandobarbosa.jetnote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import br.com.fernandobarbosa.jetnote.screens.NoteScreen
import br.com.fernandobarbosa.jetnote.ui.theme.JetNoteTheme

@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteTheme {
                Surface(color = MaterialTheme.colors.background) {
                    NoteScreen()
                }
            }
        }
    }
}