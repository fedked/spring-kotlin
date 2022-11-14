package tutoriais.springboot.springkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// o spring inicializa esta classe e torná-la responsável por lidar com solicitações de REST;
@RestController

// essa anotação chama o mapeamento de solicitação
@RequestMapping("api/hello") // define o caminho a ser usado em seu REST ou para este endpoint;

// HelloWorldController significa que este controlador de REST é responsável por quasiquer endpoints que começa com API;
class HelloWorldController {

    @GetMapping // geralmente o GET é apenas busca os dados
    fun helloWorld(): String = "Hello, this is a REST endpoint!"
}