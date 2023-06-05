package `class`

class Task(var id: Int = 0, var judul: String, var deskripsi: String, var selesai: Boolean = false) {
    override fun toString(): String {
        val status = if (selesai) "Selesai" else "Belum Selesai"
        return "ID: $id\nJudul: $judul\nDeskripsi: $deskripsi\nStatus: $status"
    }
}