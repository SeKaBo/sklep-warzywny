package com.example.sklepwarzywny.bootstrap;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootstrapRepository extends CrudRepository<BootstrapElement, Long> {
}
