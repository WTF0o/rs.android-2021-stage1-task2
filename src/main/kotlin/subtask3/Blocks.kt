package subtask3

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.logging.SimpleFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when(blockB){
            String::class -> {
               return blockA.filterIsInstance<String>().joinToString("")
            }
            Int::class ->{
                return blockA.filterIsInstance<Int>().sum()
            }
            LocalDate::class -> {
                val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd.M.yyyy")
                return blockA.filterIsInstance<LocalDate>().max()!!.format(formatter)
            }
        }
        return ""
    }
}
