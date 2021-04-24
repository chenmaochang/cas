package com.cmc.cas.service.impl;

import com.cmc.cas.entity.CaCommonUser;
import com.cmc.cas.mapper.CaCommonUserMapper;
import com.cmc.cas.service.ICaCommonUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 认证中心统一用户 服务实现类
 * </p>
 *
 * @author cmc
 * @since 2021-04-24
 */
@Service
public class CaCommonUserServiceImpl extends ServiceImpl<CaCommonUserMapper, CaCommonUser> implements ICaCommonUserService {

}
