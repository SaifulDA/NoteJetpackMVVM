package com.wiseassblog.jetpacknotesmvvmkotlin.note.notelist

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.wiseassblog.jetpacknotesmvvmkotlin.R
import kotlin.Int
import kotlin.String

public class NoteListViewDirections private constructor() {
  private data class ActionNoteListViewToNoteDetailView(
    public val noteId: String = "\"\""
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_noteListView_to_noteDetailView

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("noteId", this.noteId)
      return result
    }
  }

  public companion object {
    public fun actionNoteListViewToNoteDetailView(noteId: String = "\"\""): NavDirections =
        ActionNoteListViewToNoteDetailView(noteId)

    public fun actionNoteListViewToLoginActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_noteListView_to_loginActivity)
  }
}
