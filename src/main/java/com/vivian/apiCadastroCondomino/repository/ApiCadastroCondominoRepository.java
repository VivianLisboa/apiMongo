package com.vivian.apiCadastroCondomino.repository;

import com.vivian.apiCadastroCondomino.domain.ApiCadastroCondomino;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApiCadastroCondominoRepository extends MongoRepository<ApiCadastroCondomino, String> {

    ApiCadastroCondomino findBy_id(ObjectId _id);
}
