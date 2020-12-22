package TemplateMethod

abstract class AbstractDisplay {
    abstract fun open()
    abstract fun print()
    abstract fun close()
    fun display(){
        open()
        for (i in 0 until 5) print()
        close()
    }
}