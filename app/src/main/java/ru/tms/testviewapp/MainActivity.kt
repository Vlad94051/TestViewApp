package ru.tms.testviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.tms.testviewapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initViews()
    }

    private fun initViews() {
        openFragmentBtn.setOnClickListener {

            if (checkEditTextText()) {
                val fragment = FirstFragment.newInstance(DataSource.dataList.first())

                openFragment(FirstFragment.TAG, fragment)
            }
        }
    }

    private fun openFragment(tag: String, newInstance: FirstFragment) {
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(tag)
            .add(R.id.container, newInstance)
            .commit()
    }

    private fun checkEditTextText(): Boolean {
        val currentText = editText.text.toString()
        return currentText == FirstFragment.KEY
    }
}



