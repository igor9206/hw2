fun main() {
    val buy = 10001
    val regularCustomer = true

    if (buy > 0 && buy <= 1000) {
        println("покупка — $buy руб. →")
        if (regularCustomer) regularDiscount(buy)
    } else if (buy > 1000 && buy <= 10_000) {
        println("покупка — $buy руб. →")
        val afterDiscount = discount100Rub(buy)
        if (regularCustomer) regularDiscount(afterDiscount)
    } else if (buy > 10_000) {
        println("покупка — $buy руб. →")
        val afterDiscount = discount5Percent(buy)
        if (regularCustomer) regularDiscount(afterDiscount)
    }
}

fun regularDiscount(buy: Int): Int {
    val result = buy * 99 / 100
    println("после применения 1% скидки — $result рубля.")
    return result
}

fun discount100Rub(buy: Int): Int {
    val result = buy - 100
    println("после применения скидки — $result  руб.")
    return result
}

fun discount5Percent(buy: Int): Int {
    val result = buy * 95 / 100
    println("после применения скидки 5% — $result руб.")
    return result
}