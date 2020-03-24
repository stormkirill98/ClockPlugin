import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.StatusBarWidget
import com.intellij.openapi.wm.StatusBarWidgetProvider

class ClockProvider : StatusBarWidgetProvider {
    override fun getWidget(project: Project): StatusBarWidget {
        return ClockWidget(project)
    }
}