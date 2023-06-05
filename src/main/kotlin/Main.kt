import `class`.TaskManager
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var back: String
    val task = TaskManager()

    do {
        println("=====Manajemen Tugas=====")
        println("MENU")

        println(
            """
                1. Daftar tugas
                2. Tambah tugas baru
                3. Edit tugas 
                4. Tandai tugas selesai
                5. Tugas yang selesai
                6. Hapus tugas
            """.trimIndent()
        )

        print("Pilihan : ")
        val pilih = scanner.nextInt()

        when (pilih) {
            1 -> task.tampilkanDaftarTugas()
            2 -> task.tambahTugas()
            3 -> task.editTugas()
            4 -> task.tandaiSelesai()
            5 -> task.tampilkanDaftarTugasSelesai()
            6 -> task.hapusTugas()
            else -> println("TOLONG PILIH NO SESUAI MENU")
        }

        print("Kemenu utama? y/n : ")
        back = scanner.next()
    } while (back.equals("y"))
}
