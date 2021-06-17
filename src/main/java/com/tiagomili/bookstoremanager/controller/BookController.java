package com.tiagomili.bookstoremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/api/v1/books

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @ApiOperation(value = "aqui se coloca uma descricao para mostrar no swagger")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "retorno do metodo sucesso")
    })
    @GetMapping
    public String hello(){
        return "Hello book !";
    }
}
