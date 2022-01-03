package br.com.fernandobarbosa.jetnote.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import br.com.fernandobarbosa.jetnote.model.Note
import java.time.format.DateTimeFormatter

@Composable
fun NoteRow(
    modifier: Modifier = Modifier,
    note: Note,
    onNoteClick: (Note) -> Unit
) {
    Surface(
        modifier = Modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(topEnd = 32.dp, bottomStart = 32.dp))
            .fillMaxWidth(),
        elevation = 4.dp
    ) {
        Column(
            modifier
                .clickable { onNoteClick(note) }
                .padding(horizontal = 14.dp, vertical = 6.dp)
        ) {
            Text(
                text = note.title,
                style = MaterialTheme.typography.subtitle2
            )
            Text(
                text = note.description,
                style = MaterialTheme.typography.subtitle1
            )
//            Text(
//                text = note.entryDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss")),
//                style = MaterialTheme.typography.subtitle2
//            )
        }
    }
}