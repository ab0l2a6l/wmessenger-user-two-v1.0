package model.repository;

import model.entity.UserTwo;

public interface UserTwoDBDAOWrite {
    void save(UserTwo userOne) throws Exception;

    void close() throws Exception;
}
