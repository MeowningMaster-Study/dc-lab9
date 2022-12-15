package url.meowningmaster.dc_lab9.rest.folder

import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface FolderRepository : CrudRepository<Folder, String> {
    @Query("select * from folders")
    fun getAll(): List<Folder>

    @Modifying
    @Query("insert into folders(name) values (:name)")
    fun post(@Param("name") name: String)
}