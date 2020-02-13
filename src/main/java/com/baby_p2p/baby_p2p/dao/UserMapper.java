package com.baby_p2p.baby_p2p.dao;

import com.baby_p2p.baby_p2p.entity.TUserAccount;

public interface UserMapper {
    public TUserAccount login(String username);
}
