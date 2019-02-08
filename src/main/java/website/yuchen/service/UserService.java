package website.yuchen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import website.yuchen.dao.UserMapper;
import website.yuchen.model.UserBean;
import java.util.List;

@Service
public class UserService implements IUserService
{
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(UserBean user) {
        userMapper.insert(user);
    }

    @Override
    public UserBean findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(UserBean user) {
        userMapper.update(user);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public List<UserBean> findAll() {
        return userMapper.findAll();
    }
}