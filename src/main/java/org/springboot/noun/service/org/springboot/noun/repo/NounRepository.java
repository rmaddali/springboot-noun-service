package org.springboot.noun.service.org.springboot.noun.repo;

import org.springboot.noun.service.model.Noun;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "noun", path = "noun")
public interface NounRepository extends PagingAndSortingRepository<Noun, String> {




}
