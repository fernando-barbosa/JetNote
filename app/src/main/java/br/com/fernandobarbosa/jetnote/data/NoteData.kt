package br.com.fernandobarbosa.jetnote.data

import br.com.fernandobarbosa.jetnote.model.Note

class NoteDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Good day", description = "Went to a vacation with my family. Very nice!"),
            Note(title = "Android Compose", description = "Finish my android jetpack compose course"),
            Note(title = "Movie day", description = "Go to cinema to watch a brand new Matrix movie. Very awesome!"),
            Note(title = "Tech", description = "Read the best websites to be informed about the tech news."),
            Note(title = "Cats and cats", description = "Go to vet to take care my pets."),
            Note(title = "Listen a podcast", description = "Listen my favorite podcast about geek stuff and tech."),
            Note(title = "Good day", description = "Went to a vacation with my family. Very nice!"),
            Note(title = "Android Compose", description = "Finish my android jetpack compose course"),
            Note(title = "Movie day", description = "Go to cinema to watch a brand new Matrix movie. Very awesome!")
        )
    }
}