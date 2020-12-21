package Strategy

fun main() {
    val first  = 1
    val second  = 2
    val seed1:Int = first
    val seed2:Int = second
    val player1 = Player("두리", WinningStrategy(seed1))
    val player2 = Player("하나", WinningStrategy(seed2))
    for (i in 0 until 10000){
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()
        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner : $player1")
                player1.win()
                player2.lose()
            }
            nextHand2.isStrongerThan(nextHand1) -> {
                println("Winner : $player2")
                player1.lose()
                player2.win()
            }
            else -> {
                println("Even...")
                player1.even()
                player2.even()
            }
        }
    }
    println("Total result:")
    println(player1.toString())
    println(player2.toString())

}