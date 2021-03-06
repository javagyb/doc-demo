package net.winroad.MQ;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户注册消息
 * @mqProducer GROUP:GroupA Topic:MQ-MSG-TOPICS-TEST 
 * Created by ada on 2017.11.11
 * @author Ada
 */
@Getter
@Setter
public class NewUserRegMessage implements Serializable {
	/**
	 * 用户ID
	 */
	private String userId;
}
