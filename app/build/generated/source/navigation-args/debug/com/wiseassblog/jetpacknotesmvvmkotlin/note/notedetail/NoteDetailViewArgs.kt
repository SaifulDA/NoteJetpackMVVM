package com.wiseassblog.jetpacknotesmvvmkotlin.note.notedetail

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class NoteDetailViewArgs(
  public val noteId: String = "\"\""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("noteId", this.noteId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NoteDetailViewArgs {
      bundle.setClassLoader(NoteDetailViewArgs::class.java.classLoader)
      val __noteId : String?
      if (bundle.containsKey("noteId")) {
        __noteId = bundle.getString("noteId")
        if (__noteId == null) {
          throw IllegalArgumentException("Argument \"noteId\" is marked as non-null but was passed a null value.")
        }
      } else {
        __noteId = "\"\""
      }
      return NoteDetailViewArgs(__noteId)
    }
  }
}
