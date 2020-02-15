package com.installsync.platform.repository;

import com.installsync.platform.model.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
