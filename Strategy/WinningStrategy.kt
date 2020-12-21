package Strategy

import kotlin.random.Random

class WinningStrategy: Strategy {

    private var random:Random
    private var won:Boolean = false
    private lateinit var prevHand: Hand

    constructor(seed:Int) {
        this.random = Random(seed)
    }

    override fun nextHand(): Hand {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        this.won = win
    }
}