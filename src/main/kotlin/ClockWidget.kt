import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.StatusBarWidget
import com.intellij.openapi.wm.impl.status.EditorBasedWidget

class ClockWidget(project: Project) : EditorBasedWidget(project) {
    override fun ID(): String {
        return "ClockWidget"
    }

    override fun getPresentation(): StatusBarWidget.WidgetPresentation? {
        return ClockPresentation()
    }
}
