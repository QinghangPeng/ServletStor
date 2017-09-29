package com.nstc.fmis.service;

import java.rmi.RemoteException;

import com.nstc.fmis.model2.InterAccount;
import com.nstc.fmis.model2.InterAccountSeq;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author 作者 penghao
 * 
 * @since：2017-9-27 下午06:01:32
 * 
 */
public class Test {
    public static void main(String[] args) {
        String urlString = "http://localhost:5020/fmis/service/ERPService";
        ERPServicePortTypeProxy erpServicePortTypeProxy = new ERPServicePortTypeProxy(urlString);
        InterAccountSeq inteSeq = new InterAccountSeq();
        inteSeq.setACCOUNT_NO("210107001");
        inteSeq.setBOOK_DATE("2013-01-29");
        try {
            InterAccount intAccount = erpServicePortTypeProxy.queryInterAccount(inteSeq);
            System.out.println("ceshi:"+intAccount.getACCOUNT_NO()+","+intAccount.getAmount()+","+intAccount.getBOOK_DATE()
                    +","+intAccount.getRET_CODE().toString());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
