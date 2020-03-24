import java.text.SimpleDateFormat
import java.util.*

fun nowTime(): String {
    val formatter = SimpleDateFormat("HH:mm:ss")
    return formatter.format(Date())
}