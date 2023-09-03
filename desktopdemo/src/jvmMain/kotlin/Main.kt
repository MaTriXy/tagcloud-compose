import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import eu.wewox.tagcloud.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TagCloud",
    ) {
        App()
    }
}
