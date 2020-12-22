package TemplateMethod

fun main() {
    val d1 = CharDisplay('H')
    val d2 = StringDisplay("Hello, world.")
    val d3 = StringDisplay("안녕하세요")
    d1.display()
    d2.display()
    d3.display()
}