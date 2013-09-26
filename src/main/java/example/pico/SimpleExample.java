package example.pico;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class SimpleExample {
	public static void main(String[] args) {
		MutablePicoContainer pico = new DefaultPicoContainer();
		pico.addComponent(School.class);
		pico.addComponent(Girl.class);
		
		Girl girl = pico.getComponent(Girl.class);
		girl.setSchool("school 1");
		girl.saySchoolName();
	}
}
