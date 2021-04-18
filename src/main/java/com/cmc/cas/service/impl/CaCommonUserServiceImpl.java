package com.cmc.cas.service.impl;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.lang.Assert;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import com.cmc.cas.common.dto.user.RegisterUserDTO;
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
 * @since 2021-04-18
 */
@Service
public class CaCommonUserServiceImpl extends ServiceImpl<CaCommonUserMapper, CaCommonUser> implements ICaCommonUserService {

    @Override
    public void registerUser(RegisterUserDTO userDTO) {
    }

    public static void main(String[] args) {
        RSA rsa = new RSA();
        String privateKeyBase64 = rsa.getPrivateKeyBase64();
        String publicKeyBase64 = rsa.getPublicKeyBase64();
        /*
        //公钥加密，私钥解密
        byte[] encrypt = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa", CharsetUtil.CHARSET_UTF_8), KeyType.PublicKey);
        byte[] decrypt = rsa.decrypt(encrypt, KeyType.PrivateKey);
        System.out.println(StrUtil.str(decrypt, CharsetUtil.CHARSET_UTF_8));
        //私钥加密，公钥解密
        byte[] encrypt2 = rsa.encrypt(StrUtil.bytes("我是一段测试aaaab", CharsetUtil.CHARSET_UTF_8), KeyType.PrivateKey);
        byte[] decrypt2 = rsa.decrypt(encrypt2, KeyType.PublicKey);
        System.out.println(StrUtil.str(decrypt2, CharsetUtil.CHARSET_UTF_8));



        RSA rsa2 = new RSA(privateKeyBase64, null);
        String encriptStr = HexUtil.encodeHexStr(encrypt);

        byte[] aByte = HexUtil.decodeHex(encriptStr);
        byte[] decrypt3 = rsa2.decrypt(aByte, KeyType.PrivateKey);
        StrUtil.str(decrypt3, CharsetUtil.CHARSET_UTF_8);*/
        Sign sign = SecureUtil.sign(SignAlgorithm.MD5withRSA, privateKeyBase64, publicKeyBase64);
        String dataStr="我是消息";
        byte[] signed = sign.sign(dataStr.getBytes());
        boolean verify = sign.verify(dataStr.getBytes(), signed);
        System.out.println(verify);
    }
}
