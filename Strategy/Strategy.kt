package Strategy

interface Strategy {
    fun nextHand(): Hand
    fun study(win:Boolean):Unit
}