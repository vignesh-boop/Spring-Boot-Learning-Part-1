package com.properties.properties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repocitory extends JpaRepository<Book,Long>{

}
