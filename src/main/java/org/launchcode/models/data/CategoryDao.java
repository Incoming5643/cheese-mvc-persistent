package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

/**
 * Created by student on 4/10/2017.
 */
@Repository
@Transactional

public interface CategoryDao extends CrudRepository<Category, Integer> {
}