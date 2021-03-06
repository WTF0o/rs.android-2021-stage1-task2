package subtask1

import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        //throw NotImplementedError("Not implemented")
        val calendar: GregorianCalendar = GregorianCalendar()
        calendar.isLenient = false
        return try {
            calendar.set(year.toInt(), month.toInt() - 1, day.toInt())
            val formatter: SimpleDateFormat = SimpleDateFormat("d MMMM, EEEE", Locale("ru"))
            formatter.format(calendar.time)
        } catch (e: Exception){
            "Такого дня не существует"
        }

    }
}
