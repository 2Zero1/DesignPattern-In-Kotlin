package Strategy

import kotlin.random.Random

class ProbStrategy: Strategy {
    private val random:Random
    private var prevHandValue = 0
    private var currentHandValue = 0
    private val history = arrayOf(arrayOf(1,1,1), arrayOf(1,1,1), arrayOf(1,1,1))

    constructor(seed: Int) {
        this.random = Random(seed)
    }

    override fun nextHand(): Hand {
        val bet = random.nextInt(getSum(currentHandValue))
        val handvalue = when {
            bet < history[currentHandValue][0] -> {
                0
            }
            bet < history[currentHandValue][0] + history[currentHandValue][1] -> {
                1
            }
            else -> {
                2
            }
        }
        prevHandValue = currentHandValue
        currentHandValue = handvalue
        return Hand.getHand(handvalue)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }
    private fun getSum(hv:Int):Int {
        var sum = 0
        for (i in 1..3){
            sum += history[hv][i]
        }
        return sum
    }
}