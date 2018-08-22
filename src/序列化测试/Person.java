package 序列化测试;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = -6292079471023471185L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
