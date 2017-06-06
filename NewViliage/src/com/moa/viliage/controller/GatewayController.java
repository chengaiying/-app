package com.moa.viliage.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.jfinal.core.Controller;
import com.moa.viliage.common.AlipayServiceEnvConstants;

public class GatewayController extends Controller {
	
	public void oauth() {

//        //支付宝响应消息  
//        String responseMsg = "";
//
//        //1. 解析请求参数
//        Map<String, String> params = getRequestParams(getRequest());
//
//
//        try {
//            //2. 验证签名
//            this.verifySign(params);
//
//            //3. 获取业务执行器   根据请求中的 service, msgType, eventType, actionParam 确定执行器
//            ActionExecutor executor = Dispatcher.getExecutor(params);
//
//            //4. 执行业务逻辑
//            responseMsg = executor.execute();
//
//        } catch (AlipayApiException alipayApiException) {
//            //开发者可以根据异常自行进行处理
//            alipayApiException.printStackTrace();
//
//        } catch (Exception exception) {
//            //开发者可以根据异常自行进行处理
//            exception.printStackTrace();
//
//        } finally {
//            //5. 响应结果加签及返回
//            try {
//                //对响应内容加签
//                responseMsg = AlipaySignature.encryptAndSign(responseMsg,
//                    AlipayServiceEnvConstants.ALIPAY_PUBLIC_KEY,
//                    AlipayServiceEnvConstants.PRIVATE_KEY, AlipayServiceEnvConstants.CHARSET,
//                    false, true);
//
//                //http 内容应答
//                response.reset();
//                response.setContentType("text/xml;charset=utf-8");
//                PrintWriter printWriter = response.getWriter();
//                printWriter.print(responseMsg);
//                response.flushBuffer();
//                System.out.println("************************ alipay haha responseMsg  **********************************");
//                //开发者自行决定是否要记录，视自己需求
//                LogUtil.log("开发者响应串", responseMsg);
//
//            } catch (AlipayApiException alipayApiException) {
//                //开发者可以根据异常自行进行处理
//                alipayApiException.printStackTrace();
//            }
//        }
//    
//		
//		
//		
//		redirect("https://openauth.alipay.com/oauth2/publicAppAuthorize.htm?app_id=2016070401580572&scope=auth_userinfo&redirect_uri=http%3A%2F%2Fsrv.qswteck.com%3A8700%2Fregister.html");
	}
	
	
    /**
     * 获取所有request请求参数key-value
     * 
     * @param request
     * @return
     */
    private Map<String, String> getRequestParams(HttpServletRequest request){
        
        Map<String, String> params = new HashMap<String, String>();
        if(null != request){
            Set<String> paramsKey = request.getParameterMap().keySet();
            for(String key : paramsKey){
                params.put(key, request.getParameter(key));
            }
        }
        return params;
    }
    
    /**
     * 验签
     * 
     * @param request
     * @return
     */
    private void verifySign(Map<String, String> params) throws AlipayApiException {

        if (!AlipaySignature.rsaCheckV2(params, AlipayServiceEnvConstants.ALIPAY_PUBLIC_KEY,
            AlipayServiceEnvConstants.SIGN_CHARSET)) {

            throw new AlipayApiException("verify sign fail.");
        }
    }
}
