package com.baby_p2p.baby_p2p.service;

import com.baby_p2p.baby_p2p.entity.TUserAccount;
import com.baby_p2p.baby_p2p.entity.TUserInfo;

public interface UserService {
    public TUserAccount login(String username);
}
