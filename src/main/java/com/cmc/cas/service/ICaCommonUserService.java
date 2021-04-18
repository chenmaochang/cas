package com.cmc.cas.service;

import com.cmc.cas.common.dto.user.RegisterUserDTO;
import com.cmc.cas.entity.CaCommonUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 认证中心统一用户 服务类
 * </p>
 *
 * @author cmc
 * @since 2021-04-18
 */
public interface ICaCommonUserService extends IService<CaCommonUser> {
    void registerUser(RegisterUserDTO userDTO);
}
