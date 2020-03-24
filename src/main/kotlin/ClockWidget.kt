import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.StatusBarWidget
import com.intellij.openapi.wm.impl.status.EditorBasedWidget

const val CLOCK_WIDGET_ID = "ClockWidget"

class ClockWidget(project: Project) : EditorBasedWidget(project) {
    override fun ID(): String {
        return CLOCK_WIDGET_ID
    }

    override fun getPresentation(): StatusBarWidget.WidgetPresentation? {
        return ClockPresentation()
    }
}
