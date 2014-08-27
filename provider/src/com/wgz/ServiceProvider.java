/**
 * *********************** 版权声明 ***********************************
 *
 * 版权所有：wgz
 * ©CopyRight wgz03310126 2014   
 *  
 * *******************************************************************
*/

package com.wgz;

/**
 * 服务提供类
 *
 * @author    wgz
 * @version   Ver 3.0
 * @since     Ver 3.0
 * @Date      2014-8-27
 *
 */
public class ServiceProvider implements ServiceInterface {

    @Override
    public String getProviderName() {
        
        return "Demo Service Provider";
        
    }

    @Override
    public void execute() {
        
        System.out.println("Demo Service Execute");
        
    }

}

