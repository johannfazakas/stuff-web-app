import kotlinx.browser.document
import react.Fragment
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.h1

fun main() {
    document.bgColor = "green"
    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    createRoot(container).render(Fragment.create {
        h1 {
            +"Welcome! This will someday by my Portfolio App! It uses React+Kotlin/JS!"
        }
    })
}
