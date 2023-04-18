import kotlinx.browser.document
import react.Fragment
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.h1

fun main() {
    document.bgColor = "red"
    val container = document.getElementById("root") ?: error("Couldn't find root container!")
    createRoot(container).render(Fragment.create {
        h1 {
            +"Welcome to Stuff! Here you can manage your Stuff(...LE hmm I might also make it a bit more specific as I have new ideas)!... well, you name it! This is a React+Kotlin/JS app!"
        }
    })
}
