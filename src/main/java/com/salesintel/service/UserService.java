package com.salesintel.service;

import com.salesintel.model.response.PageResponse;
import com.salesintel.model.User;
import com.salesintel.model.response.UserResponse;
import com.salesintel.repository.UserRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public PageResponse<UserResponse> getUsers(int page, int size) {
        PanacheQuery<User>  panacheQuery = userRepository.findAll().page(page, size);

        return new PageResponse<>(panacheQuery.list(), UserResponse::new, panacheQuery.page().size, panacheQuery.pageCount(), panacheQuery.count(), panacheQuery.stream().count());
    }

}
