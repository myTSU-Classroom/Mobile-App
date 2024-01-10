package com.example.mytsuclassroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
<<<<<<<< HEAD:app/src/main/java/com/example/mytsuclassroom/AddNewDiscipline.kt
 * Use the [AddNewDiscipline.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddNewDiscipline : Fragment() {
========
 * Use the [EditEducationDirectionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EditEducationDirectionFragment : Fragment() {
>>>>>>>> origin/main:app/src/main/java/com/example/mytsuclassroom/EditEducationDirectionFragment.kt
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
<<<<<<<< HEAD:app/src/main/java/com/example/mytsuclassroom/AddNewDiscipline.kt
        return inflater.inflate(R.layout.fragment_add_new_discipline, container, false)
========
        return inflater.inflate(R.layout.fragment_edit_education_direction, container, false)
>>>>>>>> origin/main:app/src/main/java/com/example/mytsuclassroom/EditEducationDirectionFragment.kt
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
<<<<<<<< HEAD:app/src/main/java/com/example/mytsuclassroom/AddNewDiscipline.kt
         * @return A new instance of fragment AddNewDiscipline.
========
         * @return A new instance of fragment EditEducationDirectionFragment.
>>>>>>>> origin/main:app/src/main/java/com/example/mytsuclassroom/EditEducationDirectionFragment.kt
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
<<<<<<<< HEAD:app/src/main/java/com/example/mytsuclassroom/AddNewDiscipline.kt
            AddNewDiscipline().apply {
========
            EditEducationDirectionFragment().apply {
>>>>>>>> origin/main:app/src/main/java/com/example/mytsuclassroom/EditEducationDirectionFragment.kt
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}