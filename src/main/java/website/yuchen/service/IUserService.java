package website.yuchen.service;

import website.yuchen.model.UserBean;
import java.util.List;

public interface IUserService {
    public void insert(UserBean user);
    public UserBean findById(Integer id);
    public void update(UserBean user);
    public void deleteById(Integer id);
    public List<UserBean> findAll();
}