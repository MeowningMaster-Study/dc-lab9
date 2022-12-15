package url.meowningmaster.dc_lab9

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@SpringBootApplication
class DcLab9Application

fun main(args: Array<String>) {
	runApplication<DcLab9Application>(*args)
}