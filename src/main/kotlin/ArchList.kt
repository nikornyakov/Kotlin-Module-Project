class ArchList: Commander() {

    private var archiveMenu: MutableMap<Int,Archive> = HashMap()

    override fun createArch() {
        println("Напишите название архива:")
        val a = readLine()!!
        val b = Archive(a, NoteList())
        archiveMenu[(archiveMenu.size + 1)] = b
    }

    override fun command() {
        for (j in 1..archiveMenu.size) {
            val str = archiveMenu[j]?.name
            println("$j.$str")
        }
    }
     override fun printArch() {
         while (true) {
             println("Список архивов:")
             println("0. Создать архив")
             menuNumber = archiveMenu.size + 1
             if (archiveMenu.isNotEmpty()) command()
                 println("${menuNumber}. Выход.")
                    select = read()
             when(select) {
                 0 -> createArch()
                 menuNumber -> return
                 else -> if (archiveMenu.contains(select)) archiveMenu[select]?.noteMenu?.printArch() else println("Такого архива не существует")
             }
         }
     }
}
