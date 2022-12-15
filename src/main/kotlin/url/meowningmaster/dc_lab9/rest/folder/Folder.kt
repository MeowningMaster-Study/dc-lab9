package url.meowningmaster.dc_lab9.rest.folder

import org.springframework.data.relational.core.mapping.Table

@Table(name = "folders")
data class Folder(val name: String)