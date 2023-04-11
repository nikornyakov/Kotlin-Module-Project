open class Commander {
    var menuNumber: Int = 0
    var select: Int = 0
    var noteText: MutableMap<Int,Notes> = HashMap()


    fun read(): Int {
        while (true) {
            val choice = readlnOrNull()?.toIntOrNull()
            if (choice != null) return choice else println("Выберите пункт меню")
        }
    }

    open fun printArch() {}
    open fun command() {}
    open fun createArch() {}
}