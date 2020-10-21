import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

public class XlassDemo extends ClassLoader {
	
	public static void main(String[] args) throws Exception {
		
		Class clazz = new XlassDemo().findClass("Hello");
		Method method = clazz.getMethod("hello");
		method.invoke(clazz.newInstance());
		
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		
		byte[] classByte = null;
		try {
			InputStream is = new FileInputStream("./Hello.xlass");
			byte[] buff = new byte[1024];
			int read = is.read(buff);
			classByte = new byte[read];
			for(int i=0;i<read;i++) {
				classByte[i] = (byte) (255 - buff[i]);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return defineClass(name, classByte, 0, classByte.length);
		
	}

	
	
}
