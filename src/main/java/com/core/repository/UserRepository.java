package com.core.repository;

import com.core.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yonghuo.chen on 17/6/1.
 */
public interface UserRepository extends JpaRepository<User,Integer>{


}
