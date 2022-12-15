package url.meowningmaster.dc_lab9.rest.file

import org.springframework.stereotype.Service

@Service
class FileService(val db: FileRepository) {
    fun getAll(): List<File> = db.getAll()

    fun post(file: File) {
        db.post(file.folder, file.name, file.content)
    }

    fun delete(id: FileId) {
        db.delete(id.folder, id.name)
    }

    fun update(file: File) {
        db.update(file.folder, file.name, file.content)
    }
}