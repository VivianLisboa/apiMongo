package com.vivian.apiCadastroCondomino.controller;

import com.vivian.apiCadastroCondomino.domain.ApiCadastroCondomino;
import com.vivian.apiCadastroCondomino.repository.ApiCadastroCondominoRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/condomino")
public class ApiCadastroCondominoController {
    @Autowired
    private ApiCadastroCondominoRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<ApiCadastroCondomino> getApiCadastroCondomino() {
        return repository.findAll();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ApiCadastroCondomino getApiCadastroCondominoById(@PathVariable("id") ObjectId id) {

        return repository.findBy_id(id);

    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ApiCadastroCondomino criarCadastro(@Valid @RequestBody ApiCadastroCondomino apiCadastroCondomino ) {

        apiCadastroCondomino.set_id(ObjectId.get());
        repository.save(apiCadastroCondomino);
        return apiCadastroCondomino;
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void editarApiCadastroCondominoById(@PathVariable("id")ObjectId id,@Valid @RequestBody ApiCadastroCondomino apiCadastroCondomino) {
        apiCadastroCondomino.set_id (id);
        repository.save(apiCadastroCondomino);

    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteApiCadastroCondomino(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}


