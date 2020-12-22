package TemplateMethod

class CharDisplay(private val ch:Char):AbstractDisplay() {
    override fun open() {
        print("<<")
    }

    override fun print() {
        print(ch)
    }

    override fun close() {
        print(">>")
    }
}