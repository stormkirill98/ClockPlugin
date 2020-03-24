import com.intellij.openapi.wm.CustomStatusBarWidget
import com.intellij.openapi.wm.StatusBar
import javax.swing.JLabel
import javax.swing.Timer

class ClockWidget : CustomStatusBarWidget {
    private val label = JLabel(nowTime())
    private val timer = Timer(1000) { label.text = nowTime() }

    override fun ID() = ID
    override fun getComponent() = label
    override fun install(statusBar: StatusBar) = timer.start()
    override fun dispose() = timer.stop()

    companion object {
        const val ID = "ClockWidget"
    }
}
