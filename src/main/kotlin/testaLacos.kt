fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular ${titular}")
        println("número da conta ${numeroConta}")
        println("saldo da conta ${saldo}")
        println()
        i++
    }

    for (i in 10 downTo 1) {

        if (i == 4) {
            break
        }

    }
}