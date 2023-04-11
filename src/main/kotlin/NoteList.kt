class NoteList: Commander() {

   private fun addNotes() {
        println("Введите название заметки:")
        val n = readLine()!!
        println("Введите текст заметки")
        val text = readLine()!!
        println("Сохранено")
        val newNote = Notes(n, text)
        noteText[(noteText.size + 1)] = newNote
    }

     override fun command() {
        for (j in 1..noteText.size) {
            val str = noteText[j]?.name
            println("$j. $str")
        }
    }
     override fun printArch() {
         while (true) {
             println("Список заметок")
             println("0. Создать заметку")
            menuNumber = noteText.size + 1
            if (noteText.isNotEmpty()) command()
            println("${menuNumber}. Выход в меню.")
            select = read()
            when(select) {
                0 -> addNotes()
                menuNumber -> return
                else -> if (noteText.contains(select)) {
                    println("Текст заметки:")
                    println(noteText[select]?.noteText)
                } else println("Такой заметки не существует")
            }
        }
    }
}