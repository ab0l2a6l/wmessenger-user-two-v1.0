package model.repository;

import model.entity.UserTwo;

import java.util.List;

public interface UserTwoDBDAORead {
    List<UserTwo> findByALl(long id) throws Exception;

    void close() throws Exception;
}
