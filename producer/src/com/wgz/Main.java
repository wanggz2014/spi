/**
 * *********************** 版权声明 ***********************************
 *
 * 版权所有：wgz
 * ©CopyRight wgz03310126 2014   
 *  
 * *******************************************************************
*/

package com.wgz;

import java.net.URL;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 主函数类
 *
 * @author    wgz
 * @version   Ver 3.0
 * @since     Ver 3.0
 * @Date      2014-8-27
 *
 */
public class Main {

    //服务加载单例
    private static ServiceLoader<ServiceInterface> serviceLoader=ServiceLoader.load(ServiceInterface.class);
    
    /**
     * 主函数
     *
     * @param args      
     * @since  Ver 3.0
     */

    public static void main(String[] args) {
        
       // URL url=ServiceProvider.class.getResource("/META-INF/services/com.wgz.ServiceInterface");
        
        ServiceInterface service=null;
        Iterator<ServiceInterface> serviceIterator=serviceLoader.iterator();
        while(serviceIterator.hasNext()){
            service=serviceIterator.next();
            if(service!=null){
                break;
            }
        }
        
        System.out.println(service.getProviderName());
        
        service.execute();

    }

}

