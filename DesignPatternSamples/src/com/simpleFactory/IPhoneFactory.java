package com.simpleFactory;

/**
 * Creater 角色  工厂类
 * @author wzfzlw
 *
 */
public class IPhoneFactory {
	public static IPhone createIPhone(String type){
		IPhone iphone = null;
		if("iphone4s".equals(type)){
			iphone = new IPhone4s();
		}
		if("iphone5s".equals(type)){
			iphone = new IPhone5s();
		}
		if("iphone6Pluse".equals(type)){
			iphone = new IPhone6Plus();
		}
		return iphone;
	}
}


