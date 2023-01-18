import kotlinx.browser.document
import react.Fragment
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.h1

fun main() {
    document.bgColor = "orange"
    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    createRoot(container).render(Fragment.create {
        h1 {
            +"Welcome to the Social Diary! This is a React+Kotlin/JS app!"
        }
    })
}
