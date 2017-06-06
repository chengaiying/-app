package com.moa.viliage.common;

/**

 * Alipay.com Inc.

 * Copyright (c) 2004-2014 All Rights Reserved.

 */



/**

 * 支付宝服务窗环境常量（demo中常量只是参考，需要修改成自己的常量值）

 * 

 * @author taixu.zqq

 * @version $Id: AlipayServiceConstants.java, v 0.1 2014年7月24日 下午4:33:49 taixu.zqq Exp $

 */

public class AlipayServiceEnvConstants {


    /**支付宝公钥-从支付宝服务窗获取*/
    public static final String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDDI6d306Q8fIfCOaTXyiUeJHkrIvYISRcc73s3vF1ZT7XN8RNPwJxo8pWaJMmvyTn9N4HQ632qJBVHf8sxHi/fEsraprwCtzvzQETrNRwVxLO5jVmRGi60j8Ue1efIlzPXV9je9mkjzOmdssymZkh2QhUrCmZYI/FCEa3/cNMW0QIDAQAB";


    /**签名编码-视支付宝服务窗要求*/

    public static final String SIGN_CHARSET      = "utf-8";


    /**字符编码-传递给支付宝的数据编码*/

    public static final String CHARSET           = "utf-8";


    /**签名类型-视支付宝服务窗要求*/

    public static final String SIGN_TYPE         = "RSA";

    public static final String PARTNER           = "2088421398864580";


    /** 服务窗appId  */

    //TODO !!!! 注：该appId必须设为开发者自己的服务窗id  这里只是个测试id

    public static final String APP_ID            = "2016081001728409";


    //开发者请使用openssl生成的密钥替换此处  请看文档：https://fuwu.alipay.com/platform/doc.htm#2-1接入指南

    //TODO !!!! 注：该私钥为测试账号私钥  开发者必须设置自己的私钥 , 否则会存在安全隐患 
    public static final String PRIVATE_KEY       = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAL5Hul4+rypzp95P9lMJdQwNEtk/FXgoh0NlxAFBYQN41nRByHRfq6BDePZ9iRejfWxjEQQ59GIBGjcqBrFNDfhX3ugITWimetEukpTFKK20AX8i65ZDq+AiTtQ7baLopZSr26M0IHzf9YKb9t/1HzAies72eS+FvbwiRXzMEBlvAgMBAAECgYEAhkVLR9Hn/YbbgE7gvTvBMp3PHSoc1kuTF4YqR9CAythsTGFXOHeCPnceVqHDKcEecmt9yIO05attelvXmSmMnuc4O+HlxZvFKrjyO2LcOsjsFtLcx5RsysFaWCRzpao4TNcx2XSyFrYWhYH1JhAzid5aPGaXG+2a9gUW+A5F2WECQQDzYnigYSEE7Q3qX0oUHDo57zBw/Qm1f0TI62mgVCClDd1CBjKfkGHrhtRNJxoK1lEjB66p1cO+V0syPbriATwZAkEAyCSZ3QZ3S5TVpN55Jsg+QxvuATcQKdg/pThc+90D16jQzXLm+ReZJ55u7vm19xL52J9Rfs4IAxo07miO1fmyxwJBAKLO/GJMlwn0iZp+o89QEqMunfj3S8ddm2XMFJxrqmq/G4NPIg4bR2WGi/4QahtVwnDscqqplId/XY3+PUVyDgECQQCGkqWqSgi4l1C31KcdfpLuyL7VrlJ98FuLGkTbTRaiUW5kVhgb8NQYIZ1xrhG+GdJI54cCfkJA48QnccJo+cZNAkB+WdDp4C/RENwhS4aixn+/tI0isdLAfFRSue5VoaHFuHXkqg8+31b6KXCfccNEpD8Pt2Vw2OQ5eAQht9/oq6Tq";


    //TODO !!!! 注：该公钥为测试账号公钥  开发者必须设置自己的公钥 ,否则会存在安全隐患
    public static final String PUBLIC_KEY        = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC+R7pePq8qc6feT/ZTCXUMDRLZPxV4KIdDZcQBQWEDeNZ0Qch0X6ugQ3j2fYkXo31sYxEEOfRiARo3KgaxTQ34V97oCE1opnrRLpKUxSittAF/IuuWQ6vgIk7UO22i6KWUq9ujNCB83/WCm/bf9R8wInrO9nkvhb28IkV8zBAZbwIDAQAB";


    /**支付宝网关*/

    public static final String ALIPAY_GATEWAY    = "https://openapi.alipay.com/gateway.do";


    /**授权访问令牌的授权类型*/

    public static final String GRANT_TYPE        = "authorization_code";

}