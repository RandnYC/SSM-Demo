package website.yuchen.dao;

import website.yuchen.model.UserBean;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface UserMapper {
    public void insert(UserBean user);
    public UserBean findById(Integer id);
    public void update(UserBean user);
    public void deleteById(Integer id);
    public List<UserBean> findAll();
}