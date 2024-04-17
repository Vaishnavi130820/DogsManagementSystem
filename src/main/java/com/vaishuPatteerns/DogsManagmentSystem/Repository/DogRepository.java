package com.vaishuPatteerns.DogsManagmentSystem.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vaishuPatteerns.DogsManagmentSystem.Model.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog,Integer>{

}
