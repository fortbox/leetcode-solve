package finished.test;


/**
 * [强制] POJO类中布尔类型的变量，都不要加is，否则部分框架解析会引起序列化错误。
	反例：定义为基本数据类型Boolean isDelated;的属性，它的方法也是isDeleted(),
	RPC框架在反向解析的时候，“以为”对应的属性名称是deleted，导致属性获取不到，
	进而抛出异常。
 * @author jrxiaoweixiang
 *
 */
public class PojoTest {
	boolean isDeleted;

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
}
