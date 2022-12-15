package url.meowningmaster.dc_lab9.rest.file

import org.springframework.data.relational.core.mapping.Table

@Table(name = "files")
data class File(val folder: String, val name: String, val content: String)

data class FileId(val folder: String, val name: String)