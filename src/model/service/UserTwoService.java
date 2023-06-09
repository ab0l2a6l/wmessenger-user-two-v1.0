package model.service;

import model.entity.UserTwo;
import model.repository.UserTwoDBDAO;
import model.repository.UserTwoDBDAORead;
import model.repository.UserTwoDBDAOWrite;

import java.util.List;

public class UserTwoService implements UserTwoServiceRead, UserTwoServiceWrite {
    UserTwoDBDAOWrite write;
    UserTwoDBDAORead read;

    @Override
    public List<UserTwo> findByALl(long id) {
        List<UserTwo> userTwoList;
        try {
            read = new UserTwoDBDAO();
            userTwoList = read.findByALl(id);
            read.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return userTwoList;
    }

    @Override
    public void save(UserTwo userTwo) {
        try {
            write = new UserTwoDBDAO();
            write.save(userTwo);
            write.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
