package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.wiseassblog.jetpacknotesmvvmkotlin.R

public class NoteDetailViewDirections private constructor() {
  public companion object {
    public fun actionNoteDetailViewToNoteListView2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_noteDetailView_to_noteListView2)
  }
}
