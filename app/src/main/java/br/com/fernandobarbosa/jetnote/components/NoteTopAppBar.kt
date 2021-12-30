package br.com.fernandobarbosa.jetnote.components

import android.content.res.Resources
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import br.com.fernandobarbosa.jetnote.R

@Composable
fun NoteTopAppBar() {
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        actions = {
            //Icon(
            //    imageVector = Icons.Rounded.Notifications,
            //    contentDescription = "Top bar icon."
            //)
        },
        backgroundColor = Color(0xFF00B342)
    )
}