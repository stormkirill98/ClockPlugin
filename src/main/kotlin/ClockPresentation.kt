import com.intellij.openapi.wm.StatusBarWidget
import com.intellij.util.Consumer
import java.awt.event.MouseEvent

class ClockPresentation : StatusBarWidget.TextPresentation {
    override fun getTooltipText(): String = "Current time"

    override fun getClickConsumer(): Consumer<MouseEvent>? = null

    override fun getAlignment(): Float = Float.NaN

    override fun getText(): String = nowTime()
}