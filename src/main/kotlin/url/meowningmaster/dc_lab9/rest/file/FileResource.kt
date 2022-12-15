package url.meowningmaster.dc_lab9.rest.file

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FileResource(val service: FileService) {
    @GetMapping("/files")
    fun index(): List<File> = service.getAll()

    @PostMapping("/files")
    fun post(@RequestBody file: File) {
        service.post(file)
    }

    @DeleteMapping("/files/{folder}/{name}")
    fun delete(@PathVariable("folder") folder: String, @PathVariable("name") name: String) = service.delete(FileId(folder, name))

    @PatchMapping("/files")
    fun update(@RequestBody file: File) = service.update(file)
}