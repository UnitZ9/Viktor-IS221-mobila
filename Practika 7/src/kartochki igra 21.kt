import kotlin.random.Random

data class Card(val rank: String, val suit: String)

class Deck {
    private val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A")
    private val suits = listOf("♥", "♦", "♣", "♠")
    private val cards: MutableList<Card> = mutableListOf()

    init {
        for (suit in suits) {
            for (rank in ranks) {
                cards.add(Card(rank, suit))
            }
        }
        shuffle()
    }

    private fun shuffle() {
        cards.shuffle()
    }

    fun drawCard(): Card {
        return cards.removeAt(cards.size - 1)
    }

    fun cardsRemaining() = cards.size
}

fun cardValue(card: Card): Int {
    return when (card.rank) {
        "A" -> 11 // Два значения для Туза (11 или 1), будем расчет делать позже
        "K", "Q", "J" -> 10
        else -> card.rank.toInt()
    }
}

fun calculateHandValue(hand: List<Card>): Int {
    var value = hand.sumOf { cardValue(it) }
    var aces = hand.count { it.rank == "A" }

    // Если сумма больше 21 и в руке есть тузы, делать тузы равными 1
    while (value > 21 && aces > 0) {
        value -= 10
        aces--
    }

    return value
}

fun main() {
    val deck = Deck()
    var playerHand = mutableListOf<Card>()
    var dealerHand = mutableListOf<Card>()

    // Начальная раздача карт
    playerHand.add(deck.drawCard())
    playerHand.add(deck.drawCard())
    dealerHand.add(deck.drawCard())
    dealerHand.add(deck.drawCard())

    // Игровой процесс
    var playerBust = false
    var dealerBust = false

    // Ход игрока
    while (true) {
        println("Ваши карты: ${playerHand.joinToString(", ") { "${it.rank}${it.suit}" }} (Сумма: ${calculateHandValue(playerHand)})")
        println("Карты дилера: ${dealerHand.first().rank}${dealerHand.first().suit} и одна закрытая")

        println("Выберите действие: (1) Взять карту (2) Остановиться")
        val choice = readLine()

        when (choice) {
            "1" -> {
                playerHand.add(deck.drawCard())
                if (calculateHandValue(playerHand) > 21) {
                    playerBust = true
                    println("Вы перебрали! Общая сумма: ${calculateHandValue(playerHand)}")
                    break
                }
            }
            "2" -> break
            else -> println("Некорректный ввод. Попробуйте еще раз.")
        }
    }

    // Ход дилера
    if (!playerBust) {
        println("Ход дилера...")
        while (calculateHandValue(dealerHand) < 17) {
            dealerHand.add(deck.drawCard())
        }
        if (calculateHandValue(dealerHand) > 21) {
            dealerBust = true
            println("Дилер перебрал! Общая сумма: ${calculateHandValue(dealerHand)}")
        }
    }

    // Итоги
    println("Ваши карты: ${playerHand.joinToString(", ") { "${it.rank}${it.suit}" }} (Сумма: ${calculateHandValue(playerHand)})")
    println("Карты дилера: ${dealerHand.joinToString(", ") { "${it.rank}${it.suit}" }} (Сумма: ${calculateHandValue(dealerHand)})")

    when {
        playerBust -> println("Вы проиграли!")
        dealerBust -> println("Вы выиграли!")
        calculateHandValue(playerHand) > calculateHandValue(dealerHand) -> println("Вы выиграли!")
        calculateHandValue(playerHand) < calculateHandValue(dealerHand) -> println("Вы проиграли!")
        else -> println("Ничья!")
    }
}