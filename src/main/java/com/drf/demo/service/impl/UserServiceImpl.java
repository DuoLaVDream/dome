package com.drf.demo.service.impl;

import com.drf.demo.entity.User;
import com.drf.demo.mapper.UserMapper;
import com.drf.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Damon
 * @since 2020-01-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
