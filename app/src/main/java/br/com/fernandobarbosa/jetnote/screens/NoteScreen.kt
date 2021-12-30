package br.com.fernandobarbosa.jetnote.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fernandobarbosa.jetnote.R
import br.com.fernandobarbosa.jetnote.components.NoteButton
import br.com.fernandobarbosa.jetnote.components.NoteInputText

@ExperimentalComposeUiApi
@Composable
fun NoteScreen() {
    var title by remember {
        mutableStateOf("")
    }
    var description by remember {
        mutableStateOf("")
    }

    Column() {
        TopAppBar(
            title = {
                Text(text = stringResource(id = R.string.app_name))
            },
            actions = {
                Icon(
                    imageVector = Icons.Rounded.Notifications,
                    contentDescription = "Top bar icon.")
            },
            backgroundColor = Color(0xFF008D65)
        )

        //Content
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
                onClick = { /*TODO*/ }
            )
        }
    }
}

@ExperimentalComposeUiApi
@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen()
}