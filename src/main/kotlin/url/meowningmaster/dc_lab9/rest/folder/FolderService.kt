package url.meowningmaster.dc_lab9.rest.folder

import org.springframework.stereotype.Service

@Service
class FolderService(val db: FolderRepository) {
    fun getAll(): List<Folder> = db.getAll()

    fun post(folder: Folder) {
        db.post(folder.name)
    }

    fun delete(id: String) {
        db.deleteById(id)
    }
}