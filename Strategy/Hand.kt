package Strategy

class Hand private constructor(val handvalue:Int){
    companion object{
        val HANDVALUE_GUU = 0
        val HANDVALUE_CHO = 1
        val HANDVALUE_PAA = 2
        val hand = arrayOf(
            Hand(HANDVALUE_GUU),
            Hand(HANDVALUE_CHO),
            Hand(HANDVALUE_PAA)
        )
        val name = arrayOf("주먹", "가위", "보")

        fun getHand(handvalue: Int): Hand = hand[handvalue]

    }
    fun isStrongerThan(h: Hand) = fight(h) == 1

    fun isWeakerThan(h: Hand) = fight(h) == -1

    private fun fight(h: Hand): Int = when {
        this == h -> 0
        (this.handvalue +1 ) % 3 == h.handvalue -> 1
        else -> -1
    }

    override fun toString() = name[handvalue]

}