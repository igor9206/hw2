fun main() {
    val commissionPercent = 0.75
    val minCommission = 35
    val transfer = 1000

    val commission = commissionPercent / 100 * transfer
    val amount = if (commission < minCommission) transfer - minCommission else transfer - commission
    println(amount)
}