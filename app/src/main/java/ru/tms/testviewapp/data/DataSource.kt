package ru.tms.testviewapp.data

import ru.tms.testviewapp.R

object DataSource {
    val dataList: List<FragmentData> = createData()

    private fun createData(): List<FragmentData> {
        val item1 = FragmentData(
            iconId = R.drawable.ic_launcher_background,
            stringId = R.string.app_name
        )

        val item2 = FragmentData(
            iconId = 0, // Указать id's
            stringId = 0
        )

        return listOf(item1, item2)
    }
}