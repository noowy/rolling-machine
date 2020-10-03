package com.techtoha.rollingmachine.data;

import com.techtoha.rollingmachine.domain.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long> {
    List<Title> getTitles();
}
