package ru.tms.testviewapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.tms.testviewapp.data.FragmentData
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment(private val data: FragmentData) : Fragment() {

    companion object {
        const val TAG = "fff12"
        fun newInstance(data: FragmentData) = FirstFragment(data)

        const val KEY = "Frag 1"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setFragmentData()
    }

    private fun setFragmentData() {
        val iconId = data.iconId
        val stringId = data.stringId

        icon.setImageResource(iconId)
        title.setText(stringId)
    }
}