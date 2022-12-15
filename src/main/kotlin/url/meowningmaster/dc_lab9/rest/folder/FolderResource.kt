package url.meowningmaster.dc_lab9.rest.folder

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FolderResource(val service: FolderService) {
    @GetMapping("/folders")
    fun index(): List<Folder> = service.getAll()

    @PostMapping("/folders")
    fun post(@RequestBody folder: Folder) {
        service.post(folder)
    }

    @DeleteMapping("/folders/{name}")
    fun delete(@PathVariable("name") name: String) = service.delete(name)
}