package com.siyuan.repository;

import com.siyuan.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ruthguo on 2017/11/7.
 * @author ruthguo
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
