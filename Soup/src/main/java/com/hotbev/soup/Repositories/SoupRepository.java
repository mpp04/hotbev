package com.hotbev.soup.Repositories;

import com.hotbev.soup.Models.SoupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories("com.hotbev.soup.Repositories")
public interface SoupRepository extends JpaRepository<SoupModel, Integer> {


}
