package br.com.fernandobarbosa.jetnote.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fernandobarbosa.jetnote.R
import br.com.fernandobarbosa.jetnote.components.NoteButton
import br.com.fernandobarbosa.jetnote.components.NoteInputText
import br.com.fernandobarbosa.jetnote.components.NoteTopAppBar
import br.com.fernandobarbosa.jetnote.model.Note

@ExperimentalComposeUiApi
@Composable
fun NoteScreen(
    notes: List<Note>,
    onAddNote: (Note) -> Unit,
    onRemoveNote: (Note) -> Unit
) {
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }

    Column() {
        NoteTopAppBar()

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NoteInputText(
                modifier = Modifier.padding(
                    top = 10.dp,
                    bottom = 8.dp
                ),
                text = title,
                label = stringResource(R.string.label_title),
                onTextChange = {
                    if (it.all { char ->
                        char.isLetter() || char.isWhitespace()
                        }) title = it
                }
            )
            NoteInputText(
                modifier = Modifier.padding(
                    top = 10.dp,
                    bottom = 8.dp
                ),
                text = description,
                label = stringResource(R.string.label_description),
                onTextChange = {
                    if (it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) description = it
                }
            )
            NoteButton(
                text = stringResource(R.string.label_button),
                onClick = {
                    if (title.isNotEmpty() && description.isNotEmpty()) {
                        //save/add to the list
                        title = ""
                        description = ""
                    }
                }
            )
        }
    }
}

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen(notes = emptyList(), onAddNote = {}, onRemoveNote = {})
}