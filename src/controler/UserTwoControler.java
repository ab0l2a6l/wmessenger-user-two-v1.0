package controler;

import model.entity.UserTwo;
import model.service.UserTwoService;
import model.service.UserTwoServiceRead;
import model.service.UserTwoServiceWrite;

import java.util.List;

public class UserTwoControler {
    UserTwoServiceWrite write = new UserTwoService();
    UserTwoServiceRead read = new UserTwoService();

    public void save(UserTwo userTwo) {
        write.save(userTwo);
    }

    public List<UserTwo> findByAll(long id) {
        return read.findByALl(id);
    }
}
