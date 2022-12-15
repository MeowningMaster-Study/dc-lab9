package url.meowningmaster.dc_lab9.rest.file


import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface FileRepository : CrudRepository<File, FileId> {
    @Query("select * from files")
    fun getAll(): List<File>

    @Modifying
    @Query("insert into files(folder, name, content) values (:folder, :name, :content)")
    fun post(@Param("folder") folder: String, @Param("name") name: String, @Param("content") content: String)

    @Modifying
    @Query("delete from files where folder = :folder and name = :name")
    fun delete(@Param("folder") folder: String, @Param("name") name: String)

    @Modifying
    @Query("update files set content = :content where folder = :folder and name = :name")
    fun update(@Param("folder") folder: String, @Param("name") name: String, @Param("content") content: String)
}