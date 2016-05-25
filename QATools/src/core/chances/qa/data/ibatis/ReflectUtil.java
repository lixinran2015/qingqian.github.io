package chances.qa.data.ibatis;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import chances.qa.commons.log.QALogFactory;

/**
 * 反射帮助�?
 * 
 * @author zhangxs
 *
 */
public class ReflectUtil {

	/**
	 * 通过反射设置某个(私有)属�?多的�?
	 * @param target
	 * @param fname
	 * @param ftype
	 * @param fvalue
	 */
	public static void setFieldValue(Object target, String fname, Class ftype,
			Object fvalue) {
		if (target == null
				|| fname == null
				|| "".equals(fname)
				|| (fvalue != null && !ftype
						.isAssignableFrom(fvalue.getClass()))) {
			return;
		}
		Class clazz = target.getClass();
		try {
			Method method = clazz.getDeclaredMethod("set"
					+ Character.toUpperCase(fname.charAt(0))
					+ fname.substring(1), ftype);
			if (!Modifier.isPublic(method.getModifiers())) {
				method.setAccessible(true);
			}
			method.invoke(target, fvalue);

		} catch (Exception me) {
			try {
				Field field = clazz.getDeclaredField(fname);
				if (!Modifier.isPublic(field.getModifiers())) {
					field.setAccessible(true);
				}
				field.set(target, fvalue);
			} catch (Exception fe) {
				//EpgLogFactory.getExceptionLogger().error(fe.getMessage(),fe);
			}
		}
	}
	/**
	 * 通过反射机制得到某个私有属�?的�?
	 * @param target
	 * @param fname
	 * @return
	 */
	public static Object getFieldValue(Object target, String fname) {
		Object reslut = null;
		if (target == null || fname == null || "".equals(fname)) {
			return null;
		}
		Class clazz = target.getClass();
		try {
			Field field = clazz.getDeclaredField(fname);
			field.setAccessible(true);
			reslut = field.get(target);
		} catch (Exception me) {
			QALogFactory.getSystemLogger().error(me.getMessage(), me);
		}
		return reslut;
	}

}
