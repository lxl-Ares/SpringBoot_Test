package cn.itcast.user.service;


import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(int id){
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleteUserById(int id){
        this.userMapper.deleteByPrimaryKey(id);
    }
}
