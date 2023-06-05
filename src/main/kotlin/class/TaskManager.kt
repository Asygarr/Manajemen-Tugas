package `class`

import java.util.*
import kotlin.collections.ArrayList

class TaskManager {
    private val taskList = ArrayList<Task>()
    val scanner = Scanner(System.`in`)
    private var currentId = 1

    fun tampilkanDaftarTugas() {
        if (taskList.isEmpty()) {
            println("Belum ada tugas yang tersedia")
        } else {
            println("Daftar Tugas: ")
            for (task in taskList) {
                println(task)
                println("----------------------------------------------")
            }
        }
    }

    fun tambahTugas() {
        print("Judul: ")
        val judul: String = scanner.nextLine()
        print("Deskripsi: ")
        val deskripsi: String = scanner.nextLine()

        val newTask = Task(id = currentId, judul = judul, deskripsi = deskripsi)
        currentId++
        taskList.add(newTask)
        println("Tugas telah di tambahkan")
    }

    fun editTugas() {
        print("Judul: ")
        val judul = scanner.nextLine()
        print("Judul Baru: ")
        val newJudul = scanner.nextLine()

        val task = taskList.find { it.judul == judul }
        if (task != null) {
            task.judul = newJudul
            println("Judul tugas dengan ID $judul berhasil diubah")
        } else {
            println("Tugas dengan ID $judul tidak ditemukan")
        }
    }

    fun tandaiSelesai() {
        print("Judul tugas yang selesai: ")
        val judul = scanner.nextLine()

        val task = taskList.find { it.judul == judul }
        if (task != null) {
            task.selesai = true
            println("Tugas $judul telah selesai")
        }
    }

    fun tampilkanDaftarTugasSelesai() {
        if (taskList.isEmpty()) {
            println("Belum ada tugas yang tersedia")
        } else {
            var selesaiFound = false
            println("Daftar Tugas: ")
            for (task in taskList) {
                if (task.selesai) {
                    selesaiFound = true
                    println(task)
                    println("----------------------------------------------")
                }
            }
            if (!selesaiFound) {
                println("Tidak ada tugas yang selesai")
            }
        }
    }

    fun hapusTugas() {
        print("Judul tugas yang akan di hapus: ")
        val judul = scanner.nextLine()

        taskList.removeIf { it.judul == judul }
        println("Berhasil menghapus tugas $judul")
    }

}